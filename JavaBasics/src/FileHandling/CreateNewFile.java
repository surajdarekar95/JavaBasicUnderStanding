package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {


		File F = new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\LC.txt");
		
		try {
			if(F.createNewFile()) {
				System.out.println("File Created.....");
			}
			else {
				System.out.println("File Already Exsits");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
