package samplePackage;

import java.io.BufferedReader;/**BufferedReaderクラスのインポート*/
import java.io.BufferedWriter;/**BufferedWriterクラスのインポート*/
import java.io.File;/**Fileクラスのインポート*/
import java.io.FileNotFoundException;/**FileNotFoundExceptionクラスのインポート*/
import java.io.FileReader;/**FileReaderクラスのインポート*/
import java.io.FileWriter;/**FileWriterクラスのインポート*/
import java.io.IOException;/**IOExceptionクラスのインポート*/
import java.util.ArrayList;/**ArrayListクラスのインポート*/
import java.util.List;

/** Listクラスのインポート */

public class FileManager {
	public static void main(String args[]) {
		try {
			File csv = new File("CSV.csv");/**
											 * Fileクラスのインスタンスを生成。引数：CSV.csvを指定
											 */
			BufferedReader br = new BufferedReader(new FileReader(csv));/**
																		 * BufferedReaderクラスのインスタンスを生成。
																		 * 引数にFileReaderクラスのインスタンスを生成。
																		 * FileReaderクラスの引数にcsvを指定
																		 */

			Editor edi = new Editor();/** Editorクラスのインスタンスを生成 */

			while ((edi.line = br.readLine()) != null) {/**
														 * BufferedReaderクラスのreadLineメソッドでデータを一行ずつ読み込み、
														 * Editorクラスのlineフィールドに代入。
														 * lineがnullではない間while文を実行。
														 */
				edi.editor();/** Editorクラスのeditorメソッドをよびだし */
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false));/**
																				 * BufferedWriterクラスのインスタンスを生成。
																				 * 引数にFileWriterクラスのインスタンスを生成。
																				 * FileWriterクラスの第１引数にcsv、第2引数にfalseを指定しCSVファイルを上書き
																				 */
			for (String mes : edi.list) {/**
											 * Editorクラスのlistの要素を1つずつ取り出しString型の変数mesに代入
											 * 要素を全て取り出すまで繰り返す
											 */
				bw.write(mes);/** mesに代入されている文字列をCSVファイルに書き込む */
				bw.newLine();/** 改行を行う */
				bw.flush();/** バッファリングしているデータを書き込む */
			}

			br.close();/** BufferedReaderクラスのインスタンスを閉じる */
			bw.close();/** BufferedWriterクラスのインスタンスを閉じる */
		} catch (FileNotFoundException e) {/** 型：FileNotFoundException 変数名:e */
			e.printStackTrace();/** FileNotFoundExceptionの例外発生時スタックトレースを表示 */
		} catch (IOException e) {/** 型：IOException 変数名:e */
			e.printStackTrace();/** IOExceptionの例外発生時スタックトレースを表示 */
		}
	}
}

/**
 * List<String>クラスのlist変数にArrayList<String>のインスタンスを生成。 editorメソッド：i + ","
 * +lineをコンソールに表示し、listに追加する。iをインクリメントする
 *
 * @param line
 *            CSVファイルから読み込んだ一行を代入する変数
 * @param i
 *            追加する行番号
 */

class Editor {
	List<String> list = new ArrayList<String>();
	/** List<String>クラスの変数listを宣言しArrayList<String>のインスタンスを生成 */
	String line;
	/** String型の変数lineを宣言 */
	int i = 1;

	/** int型の変数iを1で初期化 */

	/**
	 * i + "," +lineをコンソールに表示し、listに追加する。iをインクリメントする
	 *
	 * @param line
	 *            CSVファイルから読み込んだ一行を代入する変数
	 * @param i
	 *            追加する行番号
	 */

	void editor() {
		System.out.println(i + "," + line);/** i + "," + lineを表示する */
		list.add(i + "," + line);/** i + "," + lineをlistに追加する */
		i++;/** iをインクリメントする */

	}

}
