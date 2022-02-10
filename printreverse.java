package Hackerblocksquestions;
import java.util.*;

public class printreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        		int sum = 0;
		for (int i = n; i != 0; i = n) {
			int rem;
			rem = n % 10;
			sum = sum*10+ rem;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
