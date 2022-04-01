package Hackerblocksquestions;

import java.util.*;
import java.util.Arrays;
public class pairsum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		twosum(arr,target);
	}
	public static void twosum(int arr[],int T) {
		int s=0;
		int e=arr.length-1;
		while(s<e)
		{
			if(arr[s]+arr[e]==T)
			{
				System.out.println(arr[s]+" and "+arr[e]);
				s++;
				e--;
			}
			else if(arr[s]+arr[e]>T)
			{
				e--;
			}
			else
			{
				s++;
			}
		}
		
	}

}
