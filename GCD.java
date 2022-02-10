package Hackerblocksquestions;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		int r = 1;
		while (r != 0) {
			r = dividend % divisor;
			dividend = divisor;
			divisor = r;
		}
		System.out.println(dividend);

	}

}
