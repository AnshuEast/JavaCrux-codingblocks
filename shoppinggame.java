package Hackerblocksquestions;
import java.util.*;
//https://hack.codingblocks.com/app/contests/2883/696/problem

public class shoppinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// no of test cases;
		for (long  i = 1; i <= T; i++) {
			int  M = sc.nextInt();// maximum number of smartphones;
			int  N = sc.nextInt();// maximum number of smartphones;
			int  A = 0;
			int  H = 0;
			for (int  j = 1;; j++) {
				if (j % 2 == 1) {
					A = A + j;
				} else {
					H = H + j;
				}
				if(A>=M)
				{
					System.out.println("Harshit");
					break;
				}
				else if(H>=N)
				{
					System.out.println("Aayush");
					break;
				}
                else
                {
                    continue;
                }
			}

		}

	}

}
