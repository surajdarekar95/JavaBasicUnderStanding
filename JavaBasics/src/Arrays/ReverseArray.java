package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		int r[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < r.length; i++) {
			r[i] = sc.nextInt();
		}

		System.out.println("Array Elements :");

		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}

		System.out.println("Reversed Array :");
		for (int i = r.length - 1; i >= 0; i--) {
			System.out.println(r[i]);
		}
	}

}
