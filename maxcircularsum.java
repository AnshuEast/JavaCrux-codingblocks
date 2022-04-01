package Hackerblocksquestions;

import java.util.Scanner;

public class maxcircularsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2*n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		circular(arr);
	}
	public static void circular(int arr[])
	{
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int currsum=0;
			for(int j=i;j<arr.length;j++)
			{
				currsum=currsum+arr[j];
			}
			maxsum=Math.max(maxsum, currsum);
		}
		System.out.println(maxsum);
	}
}
