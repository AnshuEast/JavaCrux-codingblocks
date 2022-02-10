package Hackerblocksquestions;
import java.util.*;
public class simpleinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			sum += n;
			if (sum >= 0) 
				 {
					System.out.println(n);
				}
			else
			{
				break;
			}

		}

	}

}
