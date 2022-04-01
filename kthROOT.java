package Hackerblocksquestions;

import java.util.Scanner;

public class kthROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			long result = root(n, k);
			System.out.println(result);
		}
	}

	public static long root(long n, long k) {
		long s = 0;
		long e = n;
		long ans = 0;
		while (s <= e) {
			long mid = (s + e)/2;
			if ((long)Math.pow(mid, k) <= n) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}
}
