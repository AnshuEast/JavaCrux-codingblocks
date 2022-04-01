package Hackerblocksquestions;

import java.util.Scanner;

public class rotate_image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i = arr[0].length-1;i>=0; i--) {
			for (int j = 0;j<=n-1; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
