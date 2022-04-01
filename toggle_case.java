package Hackerblocksquestions;

import java.util.Scanner;

public class toggle_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c;
		int n;
		String z = "";
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c >= 97 && c <= 122) {
				n = c - 32;
				c = (char) n;
				z += c;
			} else {
				c = (char) (c + 32);
				z += c;
			}
		}
		System.out.println(z);
	}
}
