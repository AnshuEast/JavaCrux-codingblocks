package Hackerblocksquestions;

import java.util.Scanner;

public class productarrayexceptitself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		result=except(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	public static int[] except(int arr[])
	{
		int lfpdt=1;
		int totpdt=1;
		int []rpdt=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			totpdt*=arr[i];
		}
		for(int k=0;k<arr.length;k++)
		{
			int temp=lfpdt;
			rpdt[k]=totpdt/(arr[k]*lfpdt);
			lfpdt=arr[k];
			arr[k]=rpdt[k]*temp;
		}
		return arr;
	}
}
