package Hackerblocksquestions;

import java.util.*;

public class form_biggest_number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			formation(arr);
		}
	}

	public static void formation(int arr[]) {
		String ans = "";
		String arr1[] = new String[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i] + "";
		}
		System.out.println();
		sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			ans = arr1[i] + ans;
		}
		if (ans.charAt(0) == '0') {
			System.out.println("0");
		} else {
			System.out.println(ans);
		}

	}

	public static String[] sort(String arr1[]) {
		String temp;
		for (int i = 0; i < arr1.length; i++) {
			for(int j=i+1;j<arr1.length;j++) {
				long n1 = Long.parseLong(arr1[i] + arr1[j]);
				long n2 = Long.parseLong(arr1[j] + arr1[i]);
				if (n2 < n1) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		return arr1;
	}
}