package samplePackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	public static void main(String args[]) {
		try {
			File csv = new File("CSV.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			ArrayList<String> list = new ArrayList<String>();
			String line;
			int i = 1;
			while ((line = br.readLine()) != null) {
				System.out.println(i + "," + line);
				list.add(i + "," + line);
				i++;
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false));
			for (String mes : list) {
				bw.write(mes);
				bw.newLine();
			}

			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
