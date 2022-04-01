package Hackerblocksquestions;

import java.util.Scanner;

public class maxofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		max(arr);
	}
	public static void max(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
