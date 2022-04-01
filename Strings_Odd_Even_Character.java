package Hackerblocksquestions;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch;
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				ch = s.charAt(i);
				ch = (char) (ch + 1);
				str += ch;
			} else {
				ch = s.charAt(i);
				ch = (char) (ch - 1);
				str += ch;
			}
		}
		System.out.println(str);
	}
}
