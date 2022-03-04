package Arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {

		int c[] = { 10, 20, 80, 40, 60, 30, 40 };

		int d[] = Arrays.copyOf(c, 7);

		System.out.println("After Data Copy to Second Array ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
