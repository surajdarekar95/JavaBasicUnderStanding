package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) {

		//FileWriter will create new file and also write into file
		try {
			FileWriter fr = new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\LC.txt");

			try {
				fr.write("java is best programming launguage");
			} finally {
				fr.close();
			}

			System.out.println("Successfully Write Into File");

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
