package Hackerblocksquestions;

import java.util.Scanner;

public class rainwatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T!=0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(raintrap(arr));
		}
	}

	public static int raintrap(int arr[]) {
		int n = arr.length;
		int ans = 0;
		int min = 0;
		int leftmax[] = new int[n];
		int rightmax[] = new int[n];
		// here we calculate left max of each element
		leftmax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
		}
		rightmax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
		}
		for (int i = 0; i < n; i++) {
			min = Math.min(leftmax[i], rightmax[i]);
			ans = ans + (min - arr[i]);
		}
		return ans;
	}

}
