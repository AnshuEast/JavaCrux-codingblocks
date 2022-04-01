package Hackerblocksquestions;

import java.util.Arrays;
import java.util.Scanner;

public class tripletsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		triplet(arr,target);
	}
	public static void triplet(int arr[],int tar)
	{
		for(int i=0;i<arr.length;i++)
		{
			int s=i+1;
			int e=arr.length-1;
			while(s<e)
			{
				if(arr[i]+arr[s]+arr[e]==tar)
				{
					System.out.println(arr[i]+","+" "+arr[s]+" and "+arr[e]);
					s++;
					e--;
				}
				else if(arr[i]+arr[s]+arr[e]<tar)
				{
					s++;
				}
				else
				{
					e--;
				}
			}
		}
	}

}
