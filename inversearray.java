package Hackerblocksquestions;

import java.util.Scanner;

public class inversearray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		inverse(arr);
	}
	static void inverse(int arr[])
	{
		int inv[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int temp;
			temp=arr[i];
			inv[temp]=i;
		}
		display(inv);
	}
	static void display(int inv[])
	{
		for(int i=0;i<inv.length;i++)
		{
			System.out.println(inv[i]);
		}
	}
}
