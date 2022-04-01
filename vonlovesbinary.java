package Hackerblocksquestions;

import java.util.*;

public class vonlovesbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			decimal(num);
		}

	}

	public static void decimal(int n) {
		int ans = 0;
		int i = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = (int) (ans + rem * Math.pow(2, i));
			n = n / 10;
			i++;
		}
		System.out.println(ans);
	}

}
