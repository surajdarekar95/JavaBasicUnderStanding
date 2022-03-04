package Arrays;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };

		/*
		 * if(a==b) { System.out.println("Both are equal"); }else {
		 * System.out.println("Both are not equals");
		 * 
		 * // == operator checks only reference variable }
		 */

		if (Arrays.equals(a, b)) {
			System.out.println("Both are equals");
		} else {
			System.out.println("Not equals");
		}

		int c[][] = { { 10, 20 }, { 20, 30 }, { 30, 40 }, { 40, 50 } };
		int d[][] = { { 10, 20 }, { 20, 30 }, { 30, 40 }, { 40, 50 } };

		if (Arrays.deepEquals(c, d)) {
			System.out.println("Both multi-dimentional arrays are equal");
		} else {
			System.out.println("Both multi-dimentional arrays are not equal");

		}
	}

}
