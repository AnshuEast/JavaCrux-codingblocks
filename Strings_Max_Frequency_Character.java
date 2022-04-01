package Hackerblocksquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int max = Integer.MIN_VALUE;
		int count = 1;
		char res = 0;
		char arr[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
				if (count>max) {
					res = arr[i];
				}
			} else {
				max = Math.max(max,count);
				count = 1;
			}
		}
		 if ( s.length()==1) { res = (char) (s.charAt(0)); }
		System.out.println(res);
	}
}
