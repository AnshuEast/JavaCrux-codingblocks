package Hackerblocksquestions;

import java.util.*;

public class sumofoddevenplaceddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evenans = 0;
		int oddans= 0;
		int i=0;
		while(n!=0)
		{
			int rem;
			rem=n%10;
			i++;
			if(i%2==0)
			{
				oddans=oddans+rem;
			}
			else
			{
				evenans=evenans+rem;
			}
			n=n/10;
		}
		System.out.println(evenans);
		System.out.println(oddans);
	}

}
