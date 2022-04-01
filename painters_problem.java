package Hackerblocksquestions;

import java.util.Scanner;

public class painters_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		int nob = sc.nextInt();
		int[] board = new int[nob];
		for (int i = 0; i < board.length; i++) {
			board[i] = sc.nextInt();
		}
		search(board, nop);
	}

	public static void search(int arr[], int nop) {
		int l = 0;
		int h = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			h += arr[i];
		}
		while (l <= h) {
			int mid = (l + h) / 2;
			if (painterpossible(arr, mid, nop)==true) {
				ans = mid;
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean painterpossible(int[] arr, int mid, int nop) {
		int painter = 1;
		int sum_painter = 0;
		int i = 0;
		while (i < arr.length) {
			if (sum_painter + arr[i] <= mid) {
				sum_painter += arr[i];
				i++;
			} else {
				sum_painter = 0;
				painter++;
			}
			if (painter > nop) {
				return false;
			}
		}
		return true;
	}
}
