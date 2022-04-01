package Hackerblocksquestions;

import java.util.Scanner;

public class maximumsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		maxsubarray(arr);
	}

	public static void maxsubarray(int arr[]) {
		int maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int currsum = 0;
			for (int j = i; j < arr.length; j++) {
				currsum += arr[j];
				maxsum = Math.max(currsum, maxsum);
			}
		}
		System.out.println(maxsum);
	}

}
