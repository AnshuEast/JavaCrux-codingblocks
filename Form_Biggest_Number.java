package Hackerblocksquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Form_Biggest_Number {

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
		sort(arr1);
		for (int i = 0; i<arr1.length; i++) {
			ans = ans+arr1[i]+"";
		}
		if (ans.charAt(0) == '0') {
			ans = "0";
			System.out.println(ans);
		} else {
			System.out.println(ans);
		}
	}
	public static String[] sort(String arrStr[]) {
		for (int i = 0; i < arrStr.length; i++) {
			for (int j = i + 1; j < arrStr.length; j++) {
				if (compareStr(arrStr[j], arrStr[i])) {
					String temp = arrStr[j];
					arrStr[j] = arrStr[i];
					arrStr[i] = temp;
				}
			}
		}
		for(int i=0;i<arrStr.length;i++)
		{
			System.out.print(arrStr[i]+" ");
		}
		System.out.println();
		return arrStr;
	}

	public static boolean compareStr(String str1, String str2) {
		String x = str1 + str2;
		String y = str2 + str1;
		if (x.compareTo(y) >= 1)
			return true;
		return false;
	}
}