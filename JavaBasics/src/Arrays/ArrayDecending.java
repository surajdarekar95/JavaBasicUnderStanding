package Arrays;

import java.util.Scanner;

public class ArrayDecending {

	public static void main(String[] args) {

		int temp;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
		System.out.println("Decending Order");

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
