
public class TwoDimentionalArray {

	public static void main(String[] args) {

		int []a= {1,2,3,4};
		int b[]= {4,5,6,7};
		int []c= {7,8,9,10};
		
		int d[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		
		//System.out.println(d[1][3]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		
		String arr[][]= {{"suraj","dattaray","darekar"},
						{"at-rewadi","tal-koregaon","dis-satara"},
						{"pin-415011","bosch","pune"}};
		
				//System.out.println(arr[2][1]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
