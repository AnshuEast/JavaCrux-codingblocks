package Hackerblocksquestions;

import java.util.Scanner;

public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		compression(s);
	}

	public static void compression(String s) {
		int count = 0;
		int i=0;
		for (int j =0;j<s.length(); j++) {
			if (s.charAt(j) == s.charAt(i)) {
				count++;
			} else {
				System.out.print(s.charAt(i));
				if(count>1) {
				System.out.print(count);
				}
				count=1;
				i=j;
			}
		}
		System.out.print(s.charAt(s.length()-1));
		if(count>1) {
			System.out.print(count);
			}
	}
}
