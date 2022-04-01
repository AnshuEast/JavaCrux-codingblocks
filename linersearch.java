package Hackerblocksquestions;

import java.util.Scanner;

public class linersearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(linearsearch(arr,m));
	}
	public static int linearsearch(int arr[],int m)
	{
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==m)
			{
				return j;
			}
		}
		return -1;
	}
}
