package samplePackage;

import java.util.Scanner;

/** Scannerクラスを使用するためにimport */

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);/** Scannerクラスのインスタンスを生成 */
		System.out.println("入力");/** 入力という文字列を表示 */
		try {
			int s = sc.nextInt();/** 変数sを入力値で初期化 */
			/**
			 * iを１で初期化 iがｓ以下の間繰り返し実行 forブロックを1回実行するたびにiを１加算
			 */
			for (int i = 1; i <= s; i++) {
				if (i % 3 == 0 && i % 5 == 0) {/** iが3で割り切れるかつiが5で割り切れるとき */
					System.out.println("FizzBuzz");/** FizzBuzzという文字列を表示 */
				} else if (i % 3 == 0) {/** iが3で割り切れるとき */
					System.out.println("Fizz");/** Fizzという文字列を表示 */
				} else if (i % 5 == 0) {/** iが5で割り切れるとき */
					System.out.println("Buzz");/** Buzzという文字列を表示 */
				} else {
					System.out.println(i);/** iに代入されている整数値を表示 */
				}
			}
			sc.close();/**Scannerを閉じる*/
		} catch (Exception e) {/** 例外型：Exception 変数名：e */
			System.out.println("エラー");/** 例外が発生した時エラーという文字列を表示 */

		}
	}
}
