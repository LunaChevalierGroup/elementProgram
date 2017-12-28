package elementProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileManager {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ;

		try {
			File inputfile = new File ("src/resource/CustomerInfo.csv");
			File outputfile = new File ("src/resource/CustomerInfoOutPut.csv");
			FileReader fr = new FileReader (inputfile);
			FileWriter fw = new FileWriter (outputfile);
			FileInputStream fis = new FileInputStream (inputfile);
			FileOutputStream fos = new FileOutputStream (outputfile);
			InputStreamReader isr = new InputStreamReader (fis);
			OutputStreamWriter osw = new OutputStreamWriter (fos);
			BufferedReader br = new BufferedReader (fr);
			BufferedWriter bw = new BufferedWriter (fw);

			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				System.out.println((i++ + " ") + line);
			}
			br.close();
			bw.close();
			isr.close();
			osw.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}