package Hackerblocksquestions;

import java.util.Scanner;

public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		goodstring(s);
	}
	public static void goodstring(String s)
	{
		int ans=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(vowel(ch)==true)
			{
				count++;
			}
			else
			{
				ans=Math.max(ans, count);
				count=0;
			}
		}
		ans=Math.max(ans, count);
		System.out.println(ans);
		
	}
	public static boolean vowel(char ch)
	{
		char arr[]={'a','e','i','o','u'};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
			{
				return true;
			}
		}
		return false;
	}
}
