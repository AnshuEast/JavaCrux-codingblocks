package Hackerblocksquestions;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		System.out.println(printcount(s));
	}
	public static int printcount(String s) { 
		boolean visited[] = new boolean[s.length()];
		int count = 0;
		for (int len = 1; len <= s.length(); len++) {
			for (int si = 0; si<=s.length()-len; si++) {
				int ei = si + len;
				String str = s.substring(si, ei);
				if (iscbnumber(Long.parseLong(str)) == true && isvisited(visited, si, ei - 1) == true) {
					for (int i = si; i <= ei - 1; i++) {
						visited[i] = true;
						//count++;
					}
					count++;
				}
			}
		}
		return count;
	}

	public static boolean isvisited(boolean visited[], int si, int ei) {
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true)// if anyone visited already there it will return false;
			{
				return false;
			}
		}
		return true;
	}

	public static boolean iscbnumber(long s) {
		int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (s == 0 || s == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (s % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
