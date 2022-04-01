package Hackerblocksquestions;

import java.util.Scanner;

public class unicodequestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c >= 65 && c <= 90) {
			System.out.println("UPPERCASE");
		} else if (c >= 97 && c <= 122) {
			System.out.println("lowercase");
		} else {
			System.out.println("Invalid");
		}

	}

}
