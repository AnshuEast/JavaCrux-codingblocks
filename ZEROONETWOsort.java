package Hackerblocksquestions;
import java.util.Scanner;

public class ZEROONETWOsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
	} 
	public static void sort(int arr[])
	{
		int l=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int t=arr[mid];
				arr[mid]=arr[l];
				arr[l]=t;
				mid++;
				l++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				int t=arr[mid];
				arr[mid]=arr[high];
				arr[high]=t;
				high--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
