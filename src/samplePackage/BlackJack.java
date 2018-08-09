package samplePackage;

/** Scannerクラスをインポート */
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);/** Scannerクラスのインスタンスを生成 */
		BattleJudge bj = new BattleJudge();/** BattleJudgeクラスのインスタンスを生成 */
		TrampCreate tc = new TrampCreate();/** TrampCreateクラスのインスタンスを生成 */
		tc.pp = 0;/** プレイヤーのポイントを代入する変数ppを0で初期化 */
		tc.dp = 0;/** ディーラーのポイントを代入する変数dpを0で初期化 */

		tc.trampcreate(tc.i, tc.tlist);/**
										 * trampcreateメソッドを呼び出し、
										 * 第1引数としてcd.i、第2引数としてcd.tlist:トランプ52枚のリストを渡す
										 */

		for (tc.i = 1; tc.i <= 2; tc.i++) {/**
											 * 変数cd.iを1で初期化
											 * cd.iが2以下の間iをインクリメントしながら繰り返し
											 */

			tc.pdraw();/** pdrawメソッドの呼び出し */

			if (tc.i == 2) {/** iが2の時 */
				tc.ddraw();/** ddrawメソッドの呼び出し */
				System.out.println(tc.i + "枚目ディーラーが引いたカードは非表示です。");/** 文字列の表示 */
			} else {
				tc.ddraw();/** ddrawメソッドの呼び出し */
				System.out.println("ディーラーは" + tc.dealer + "を引きました");/** 文字列の表示 */
			}
		}

		System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");/** 文字列の表示 */

		/** break文のラベルを設定 ラベル名:a */
			while (sc.next().equals("y")) {/** 入力値が"y"と同じ間繰り返す */

				tc.pdraw();/** pdrawメソッドの呼び出し */

				if (tc.pp > 21) {/** プレイヤーのポイントが21を超えている場合に実行 */
					System.out.println("バースト（プレイヤーの負け）");/** 文字列の表示 */
//					break a;/** ラベルaを抜ける */
					System.exit(0);
				}

				System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");/** 文字列の表示 */
			}

			while (tc.dp < 17) {/** ディーラーのポイントが17より小さい間実行 */
				tc.ddraw();/** ddrawメソッドの呼び出し */
			}

			System.out.println("ディーラーのポイントは" + tc.dp);/** 文字列の表示 */

			bj.dp21 = 0;/** ディーラーのポイントと21との差を計算した値を代入する変数を0で初期化 */

			bj.dpjudge(tc.dp);/** dpjudgeメソッドを呼び出し、引数としてディーラーのポイントを渡す */
			bj.battlejudge(tc.pp);/** battlejudgeメソッドを呼び出し、引数としてプレイヤーのポイントを渡す */

		sc.close();/** closeメソッドの呼び出し */
	}
}