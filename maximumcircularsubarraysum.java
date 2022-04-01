package Hackerblocksquestions;

import java.util.Scanner;

public class maximumcircularsubarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();	
		while (T-- > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int result=circularmax(arr);
			System.out.println(result);
		}
	}

	public static int circularmax(int arr[]) {
		int non_wrap = kadanes(arr);
		int wrap_sum;
		int max;
		int totalsum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
			totalsum+=arr[i];
		}
		wrap_sum=totalsum+kadanes(arr);
		max=Math.max(non_wrap,wrap_sum);
		return max;
	}
	public static int kadanes(int arr[])
	{
		int max=Integer.MIN_VALUE;
		int currentsum=0;
		for(int i=0;i<arr.length;i++)
		{
			currentsum+=arr[i];
			if(currentsum<0)
			{
				currentsum=0;
			}
			max=Math.max(max, currentsum);
		}
		return max;
	}
}
