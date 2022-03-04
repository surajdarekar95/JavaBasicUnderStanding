package Arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Elements :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elements :");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Elements After Copy");

		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i] = a[i]);
		}
	}

}
