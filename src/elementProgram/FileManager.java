package elementProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ;

		try {
			File f = new File ("C:\\保存用\\CustomerInfo.csv") ;
			FileReader fr = new FileReader (f);
			FileInputStream fis = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader (fr);

			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
			System.out.println((i++ + " ") + line);
			}
			br.close();
			isr.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
