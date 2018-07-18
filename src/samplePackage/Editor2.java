package samplePackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {
	public static void main(String[] args) {
		try {
			File csv = new File("CSV.csv");

			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false));

			bw.write("1,a,b");
			bw.newLine();
			bw.write("2,c,d");

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
