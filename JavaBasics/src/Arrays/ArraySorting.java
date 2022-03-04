package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		Arrays.sort(a);

		System.out.println("After Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
	}

}
