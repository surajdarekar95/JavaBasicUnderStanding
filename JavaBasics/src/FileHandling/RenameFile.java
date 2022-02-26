package FileHandling;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {

		File Frename = new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\Suraj.txt");
		File renamed = new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\darekar.txt");
		if (Frename.exists()) 
		{
			//System.out.println(Frename.renameTo(new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\Suraj.txt")));
			System.out.println(Frename.renameTo(renamed));
		} 
		else
		{

			System.out.println("File Doesn't Exists...");
		}
	}

}
