package Hackerblocksquestions;

import java.util.Scanner;

public class Matrix_2D_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		int target = sc.nextInt();
		if (search(arr, target) == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public static boolean search(int arr[][], int t) {
		int s = 0;
		int e = arr[0].length - 1;
		while (s < arr.length && e >= 0) {
			if (arr[s][e] == t) {
				return true;
			} else if (arr[s][e] > t) {
				e--;
			} else {
				s++;
			}
		}
		return false;
	}
}
