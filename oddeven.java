package Hackerblocksquestions;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0 && n<=1000) {
			int anseven = 0;
			int ansodd = 0;
			int noc = sc.nextInt();
			n--;
			while(noc!=0)
			{
				int rem=noc%10;
				if((rem&1)==1)
				{
					ansodd=ansodd+rem;
				}
				else
				{
					anseven=anseven+rem;
				}
				noc=noc/10;
			}
			if((ansodd%3 == 0)||(anseven%4 == 0))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
