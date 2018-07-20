package samplePackage;

import java.util.Random;/**Randomクラスを使用するためにimport*/
import java.util.Scanner;

/** Scannerクラスを使用するためにimport */

public class Countgamemain {

	public static void main(String[] args) {
		try {
			Countgame countgame = new Countgame();/** Countgameクラスのインスタンスを生成 */
			countgame.random();/** randomメソッドを呼び出す */
			countgame.message("入力してください");/**
											 * messageメソッドを呼び出す 引数：入力してください
											 */
			while (countgame.ranum != countgame.innum) {/** ランダムクラスによって生成されたint型の変数rannumと入力された値innumに代入された整数値が違う時 */
				if (countgame.ranum < countgame.innum) {/** ranumの数値よりinnumの数値が大きいとき */
					countgame.message("はずれ、より小さな数です。もう一度入力してください");/**
																	 * messageメソッドを呼び出す
																	 * 引数:はずれ、より小さな数です。もう一度入力してください
																	 */
				} else if (countgame.ranum > countgame.innum) {/** ranumの数値よりinnumの数値が小さいとき */
					countgame.message("はずれ、より大きな数です。もう一度入力してください");/**
																	 * messageメソッドを呼び出す
																	 * 引数:はずれ、より大きな数です。もう一度入力してください
																	 */
				}
			}
			System.out.println("あたり");/** 文字列:あたりを表示 */
		} catch (Exception e) {/** 例外型：Exception 変数名：e */
			System.out.println("エラー");/** 例外が発生した時エラーという文字列を表示 */
		}
	}

}

/**
 * RandomクラスとScannerクラスのインスタンスを生成 randomメソッド:0～9までのランダムな数値でint型のranum変数を初期化する
 * messageメソッド:String型の引数：msgの文字列と入力値：という文字列を表示し入力された整数値でint型の変数innumを初期化する
 *
 * @param ranum
 *            ランダムに生成された0～9までのいずれかの数値
 * @param innum
 *            入力された数値
 * @param msg
 *            引数で指定された文字列
 */
class Countgame {
	int ranum;
	/** ランダムに生成された0～9までのいずれかの値を代入する変数を宣言 */
	int innum;
	/** 入力された値を代入する変数を宣言 */
	Scanner sc = new Scanner(System.in);
	/** Scannerクラスのインスタンスを生成 */
	Random random = new Random();

	/** Randomクラスのインスタンスを生成 */
	/**
	 * 0～9までのランダムな数値でint型のranum変数を初期化する
	 *
	 * @param ranum
	 *            ランダムに生成された0～9までのいずれかの数値
	 */
	void random() {
		ranum = random.nextInt(10);/** ranumを0～9までのランダムな数値で初期化 */
	}

	/**
	 * String型の引数：msgの文字列と入力値：という文字列を表示し入力された整数値でint型の変数innumを初期化する
	 *
	 * @param innum
	 *            入力された数値
	 * @param msg
	 *            引数で指定された文字列
	 */
	void message(String msg) {
		System.out.println(msg);/** msgに代入されている文字列を表示 */
		System.out.print("入力値：");/** 入力値:という文字列を表示 */
		innum = sc.nextInt();/** 入力された数値でinnumを初期化 */
	}
}
