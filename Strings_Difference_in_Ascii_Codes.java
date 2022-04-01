package Hackerblocksquestions;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		difference(s);
	}
	public static void difference(String s)
	{
		int diff;
		for(int i=0;i<s.length()-1;i++)
		{
			
			diff=(int)((s.charAt(i+1))-(s.charAt(i)));
			System.out.print(s.charAt(i));
			System.out.print(diff);
		}
		System.out.print(s.charAt(s.length()-1));
	}
}
