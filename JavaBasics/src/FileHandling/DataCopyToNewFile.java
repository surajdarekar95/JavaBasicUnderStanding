package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataCopyToNewFile {

	public static void main(String[] args) throws IOException {

		FileInputStream r = new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\LC.txt");
		FileOutputStream w = new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Suraj.txt");

		int i;
		while ((i = r.read()) != -1) {
			w.write((char) i);
		}
		System.out.println("Data Copied....");

	}

}
