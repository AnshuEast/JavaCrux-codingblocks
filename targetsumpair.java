package Hackerblocksquestions;

import java.util.Arrays;
import java.util.Scanner;

public class targetsumpair {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int target = sc.nextInt();
		targetsum(arr, target);
	}

	public static void targetsum(int arr[], int t) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == t) {
					System.out.println(arr[i] + " and " + arr[j]);
				}
			}
		}
	}
}
