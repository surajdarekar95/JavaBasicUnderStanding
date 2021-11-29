
public class JaggedArray {

	public static void main(String[] args) {

		//How to print jagged array
		
		int d[][]= {
					{1,2,3,4},
					{2,3,5},
					{1,4,7,8,9}
					 };
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
	}

}
