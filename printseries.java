package Hackerblocksquestions;
import java.util.*;

public class printseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		function(n, d);

	}

	static void function(int n, int d) {
		int count = 0;

		for (int i = 1; i <= (3 * n + 2); i++) {
			if ((3 * i + 2) % d != 0) {
				System.out.println((3 * i + 2));
				count++;
			}
			if (count == n) {
				break;
			}
		}
	}

}
