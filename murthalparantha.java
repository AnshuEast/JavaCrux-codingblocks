package Hackerblocksquestions;

import java.util.Scanner;

public class murthalparantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		int noc = sc.nextInt();
		int arr[] = new int[noc];// ranks with stalls of that array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		search(arr, nop);
	}

	public static void search(int[] arr, int nop) {
		int l = 0;
		int h = (int)1e8;
		int ans=0;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (ispossible(arr, mid, nop) == true) {
				ans = mid;
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean ispossible(int arr[], int mid, int nop) {
		int time=0;
		int parantha = 0;
		int i = 0;
		while (i < arr.length) {
			time = arr[i];
			int j = 2;
			while (time <= mid) {
				time = time + arr[i] * j;
				parantha++;
				j++;
			}
			if (parantha >= nop) {
				return true;
			}
			i++;
		}
		return false;
	}
}
