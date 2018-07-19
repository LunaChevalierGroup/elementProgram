package samplePackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Editor2 {
	public static void main(String[] args) {
		try {
			File csv = new File("CSV.csv");

			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false));

			bw.write("a,b");
			bw.newLine();
			bw.write("c,d");

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
