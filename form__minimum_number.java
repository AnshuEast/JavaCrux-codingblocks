package Hackerblocksquestions;

import java.util.*;

public class form__minimum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			String s = "";
			arr[i] = sc.next();
			s = arr[i];
			seqeuence(s);
			System.out.println(s);
		}
	}

	public static void seqeuence(String s) {
		ArrayList<Integer> ans = new ArrayList<>();
		int count = 1;// minimum value to inserted and keep the track of repetition
		int posi = 0;//keep the track of i;
		if (s.charAt(0) == 'I') {
			ans.add(1);
			ans.add(2);
			count = 3;
			posi = 1;
		} else {
			ans.add(2);
			ans.add(1);
			count = 3;
			posi = 0;
		}
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				ans.add(count);
				count++;
				posi=i+1;//track of the position of i
			} else {
				ans.add(ans.get(i));
				for (int j = posi; j <= i; j++) {
					ans.set(j, ans.get(j) + 1);
				}
				count++;
			}
		}

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) +"");
		}
		System.out.println();
	}

}
