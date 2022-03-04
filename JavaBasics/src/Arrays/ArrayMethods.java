package Arrays;
import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		String a[]= {"learn","coding","in","java"};
		
		int a1[]= {10,20,30,40};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));
		
		
		System.out.println(Arrays.asList(a));
		System.out.println(Arrays.asList(a1));
		
		//To pront two-D Array
		
		int a2[][]= {{10,20},{20,30},{30,40},{40,50}};
		
		System.out.println(Arrays.deepToString(a2));
	}

}
