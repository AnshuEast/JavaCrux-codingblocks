package Hackerblocksquestions;

import java.util.Scanner;

public class MaximumSUMpathOFtwoARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[] arr1 = new int[n];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			int[] arr2 = new int[m];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			int result=maximumpath(arr1,arr2);
			System.out.println(result);
		}
	}
	public static int maximumpath(int arr1[],int arr2[])
	{
		int i=0;
		int j=0;
		int sum1=0;
		int sum2=0;
		int result=0;
		int n=arr1.length;
		int m=arr2.length;
		while(i<n&&j<m)
		{
			if(arr1[i]<arr2[j])
			{
				sum1+=arr1[i++];
			}
			else if(arr1[i]>arr2[j])
			{
				sum2+=arr2[j++];
			}
			else
			{
				result+=Math.max(sum1, sum2)+arr1[i];
				sum1=0;
				sum2=0;
				i++;
				j++;
			}
		}
		while(i<n)
		{
			sum1+=arr1[i++];
		}
		while(j<m)
		{
			sum2+=arr2[j++];
		}
		result+=Math.max(sum1,sum2);
		return result;
	}
}
