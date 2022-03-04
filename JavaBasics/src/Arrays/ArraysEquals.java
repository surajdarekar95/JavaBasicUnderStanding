package Arrays;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {

		int a[]= {10,22,30,40,50,50,70};
		int b[]= {10,22,30,40,50,50,70};
		
		boolean c=Arrays.equals(a,b);
		System.out.println("Both Arrays Are Equlas? \nAns = "+c);
	}

}
