package samplePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
	public static void main(String args[]) {
		try {
			File f = new File("CSV.csv");
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String line;
			for (int i = 1; (line = br.readLine()) != null; i++) {
				String[] data = line.split(",", 0);
				System.out.print(i);
				for (String elem : data) {
					System.out.print(elem);
				}
				System.out.println();
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
