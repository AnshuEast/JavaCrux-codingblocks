package Hackerblocksquestions;

import java.util.*;

public class rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[] = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int item=sc.nextInt();
		search(arr,0,item);
	}
	public static void search(int arr[],int i,int item) {
		if(i==arr.length)
		{
			return ;
		}
		if(arr[i]==item)
		{
			System.out.print(i+" ");
		}
		search(arr, i+1, item);
	}
}