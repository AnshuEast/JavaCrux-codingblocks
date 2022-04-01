package Hackerblocksquestions;

import java.util.Scanner;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			nextpermutation(arr);
		}
	}

	public static void nextpermutation(int arr[]) {
		int n = arr.length;
		int p = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = n - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		if (p == 0 && q == 0) {
			reverse(arr, p, arr.length - 1);
			return;
		}

		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		reverse(arr, p + 1, arr.length - 1);
	}

	public static void reverse(int arr[], int i, int j) {
		int start = i;
		int end = j;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
}
