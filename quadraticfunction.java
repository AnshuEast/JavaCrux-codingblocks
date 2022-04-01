package Hackerblocksquestions;

import java.util.Scanner;

public class quadraticfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double d = (b * b - 4 * a * c);
		int root1;
		int root2;
		if (d > 0) {
			root1 = (int) (-b + Math.sqrt(d)) / (2 * a);
			root2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
			System.out.println("Real and Distinct");
			if (root1 > root2) {
				System.out.println(root2+" "+root1);
			} else {
				System.out.print(root1+" "+root2);
			}
		} else if (d == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("Real and Equal");
			System.out.print(root1 +" "+ root2);

		}
		else
		{
			System.out.println("Imaginary");
		}

	}

}
