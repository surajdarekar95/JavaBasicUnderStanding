package FileHandling;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {

		File Finfo = new File("C:\\\\Users\\\\lenovo\\\\OneDrive\\\\Desktop\\\\LC.txt");

		if (Finfo.exists()) 
		{
			System.out.println("File Name = " + Finfo.getName());
			System.out.println("FIle Path = " + Finfo.getAbsolutePath());
			System.out.println("Is File Writable = " + Finfo.canWrite());
			System.out.println("Is File Readble = " + Finfo.canRead());
			System.out.println("File Size = " + Finfo.length());
			System.out.println("File Delete = "+ Finfo.delete());
		} else
		{
			System.out.println("File Dosen't Exists");
		}
	}

}
