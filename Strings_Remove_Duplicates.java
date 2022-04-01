package Hackerblocksquestions;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = "";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
			{
				res=res+s.charAt(i);
			}
		}
		res=res+s.charAt(s.length()-1);
		System.out.println(res);
	}
}
