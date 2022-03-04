package Arrays;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		int n, count = 0;
		int S[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < S.length; i++) {
			S[i] = sc.nextInt();
		}

		System.out.println("Array Elements");

		for (int i = 0; i < S.length; i++) {
			System.out.println(S[i]);
		}

		System.out.println("Enter Search element");
		n = sc.nextInt();

		for (int i = 0; i < S.length; i++) {
			if (S[i] == n) {
				count++;
			}

		}
		if (count > 0) {
			System.out.println("Item Fount " + count + " Times ");
		} else {
			System.out.println("Not Found");
		}
	}

}
