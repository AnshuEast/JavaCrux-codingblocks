package Hackerblocksquestions;

import java.util.Arrays;
import java.util.Scanner;

public class pairofrose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			int money = sc.nextInt();
			calculate(arr, money);
		}
	}

	public static void calculate(int arr[], int M) {
		int sum = 0;
		int x = 0;
		int y = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == M) {
					int diff = Math.abs(arr[j] - arr[i]);
					if (diff < min) {
						min = diff;
						x = arr[i];
						y = arr[j];
					}
				}

			}
		}
		System.out.println("Deepak should buy roses whose prices are " + x + " and " + y+".");
	}
}
