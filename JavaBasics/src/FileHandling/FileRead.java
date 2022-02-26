package FileHandling;

import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) {

		try {
			FileReader read = new FileReader("C:\\Users\\lenovo\\OneDrive\\Desktop\\LC.txt");

			try {
				int i;
				while ((i = read.read()) != -1) {

					System.out.print((char) i);

				}
			} finally {
				read.close();
			}
		} catch (Exception e) {
			System.out.println("Exception handeled....");
		}

	}

}
