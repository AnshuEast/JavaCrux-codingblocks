package Hackerblocksquestions;
import java.util.*;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();// dividend
	int b = sc.nextInt();// divisor
	int lcm = a * b / GCD(a, b);
	System.out.println(lcm);

}

static int GCD(int a, int b) {
	int r = 1;
	while (a % b != 0) {
		r = a % b;
		a = b;
		b = r;
	}
	return b;
}

}
