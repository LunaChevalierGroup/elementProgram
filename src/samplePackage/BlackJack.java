package samplePackage;
/** Scannerクラスをインポート */
import java.util.Scanner;


public class BlackJack {

	public static void main(String[] args) {
		/** Scannerクラスのインスタンスを生成 */
		Scanner scanner = new Scanner(System.in);
		/** BattleJudgeクラスのインスタンスを生成 */
		BattleJudge battlejudge = new BattleJudge();
		/** TrampCreateクラスのインスタンスを生成 */
		TrampCreate trampcreate = new TrampCreate();
		/** プレイヤーのポイントを代入する変数ppを0で初期化 */
		trampcreate.playerpoint = 0;
		/** ディーラーのポイントを代入する変数dpを0で初期化 */
		trampcreate.dealerpoint = 0;

		/**
		 * trampcreateメソッドを呼び出し、
		 * 第1引数としてcd.i、第2引数としてcd.tlist:トランプ52枚のリストを渡す
		 */
		trampcreate.trampcreate(trampcreate.i, trampcreate.tramplist);

		/**
		 * 変数cd.iを1で初期化
		 * cd.iが2以下の間iをインクリメントしながら繰り返し
		 */
		for (trampcreate.i = 1; trampcreate.i <= 2; trampcreate.i++) {
			/** pdrawメソッドの呼び出し */
			trampcreate.playerdraw();

			/** iが2の時 */
			if (trampcreate.i == 2) {
				/** ddrawメソッドの呼び出し */
				trampcreate.dealerdraw();
				/** 文字列の表示 */
				System.out.println(trampcreate.i + "枚目ディーラーが引いたカードは非表示です。");
			} else {
				/** ddrawメソッドの呼び出し */
				trampcreate.dealerdraw();
				/** 文字列の表示 */
				System.out.println("ディーラーは" + trampcreate.dealer + "を引きました");
			}
		}
		/** 文字列の表示 */
		System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");
		/** break文のラベルを設定 ラベル名:a */
		a: {
			/** 入力値が"y"と同じ間繰り返す */
			while (scanner.next().equals("y")) {
				/** pdrawメソッドの呼び出し */
				trampcreate.playerdraw();
				/** プレイヤーのポイントが21を超えている場合に実行 */
				if (trampcreate.playerpoint > 21) {
					/** 文字列の表示 */
					System.out.println("バースト（プレイヤーの負け）");
					/** ラベルaを抜ける */
					break a;
				}
				/** 文字列の表示 */
				System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");
			}
			/** ディーラーのポイントが17より小さい間実行 */
			while (trampcreate.dealerpoint < 17) {
				/** ddrawメソッドの呼び出し */
				trampcreate.dealerdraw();
			}
			/** 文字列の表示 */
			System.out.println("ディーラーのポイントは" + trampcreate.dealerpoint);
			/** ディーラーのポイントと21との差を計算した値を代入する変数を0で初期化 */
//			bj.dp21 = 0;
			/** dpjudgeメソッドを呼び出し、引数としてディーラーのポイントを渡す */
//			bj.dpjudge(tc.dealerpoint);
			/** battlejudgeメソッドを呼び出し、引数としてプレイヤーのポイントを渡す */
			battlejudge.battlejudge(trampcreate.playerpoint,trampcreate.dealerpoint);
		}
		/** closeメソッドの呼び出し */
		scanner.close();
	}
}