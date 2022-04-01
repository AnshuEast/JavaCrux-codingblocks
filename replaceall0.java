package Hackerblocksquestions;

import java.util.Scanner;

public class replaceall0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (n <= 0) {
			System.out.println("5");
		} else {
			long i = 1;
			long ans = 0;
			while (n != 0) {
				long rem = n % 10l;
				if (rem == 0) {
					rem = 5;
				}
				ans = ans + i * rem;
				i = i * 10;
				n = n / 10;
			}
			System.out.println(ans);
		}
	}

}
