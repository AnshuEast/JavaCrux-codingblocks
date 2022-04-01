package Hackerblocksquestions;

import java.util.Scanner;

public class piyush_and_magicalpark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char[][] park = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				park[i][j] =sc.next().charAt(0);
			}
			System.out.println();
		}
		game(park, k, s);
	}

	public static void game(char park[][], int k, int s) {
		int one = 1;
		int dot = 2;
		int star = 5;
		int last=park[0].length;
			for (int i = 0; i < park.length&&s>=k; i++) {
				for (int j = 0; j < park[0].length&&s>=k; j++) {
					if (park[i][j]=='.') {
						if(j==last-1)
						{
							s = s-dot;
						}
						else {
						s = (s-dot)-one;
						}
					} else if (park[i][j] =='*') {
						if(j==last-1)
						{
						s = s+star;
						}
						else {
						s=(s+star)-one;
						}
					} else {
						break;
					}
				}
			}
		if(s>=k) {
		System.out.println("Yes");
		System.out.println(s);
		}
		else
		{
			System.out.println("No");
		}
	}
}
