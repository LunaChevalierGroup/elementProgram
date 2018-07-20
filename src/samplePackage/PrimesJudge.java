package samplePackage;

public class PrimesJudge {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);/** mainメソッドの引数の文字列をint型に変換しint型の変数numを初期化 */
			/**
			 * iを１で初期化 iがnum以下の間繰り返し実行 forブロックを1回実行するたびにiを１加算
			 */
			for (int i = 1; i <= num; i++) {
				boolean isSosu = primesJudge(i);/** primesJudgeメソッドの戻り値でboolean型の変数isSosuを初期化 */
				if (isSosu == true) {/** isSosuがtrueの時 */
					message(i, isSosu);/** messeageメソッドを呼び出す */
				} else if (isSosu == false) {/** isSosuがfalseの時 */
					message(i, isSosu);/** messeageメソッドを呼び出す */
				}
			}
		} catch (Exception e) {/** 例外型：Exception 変数名：e */
			System.out.println("エラー");/** 例外が発生した時エラーという文字列を表示 */
		}
	}

	/**
	 * 整数値iが素数であるかないかを判定するメソッドです。
	 *
	 * @param i
	 *            整数値
	 * @param isSosu
	 *            判定のための論理値
	 * @param j
	 *            割る数
	 * @return isSosu
	 */
	static boolean primesJudge(int i) {
		boolean isSosu = true;/** boolean型の変数isSosuをtrueで初期化 */
		if (i == 1) {/** iが1の時 */
			isSosu = false;/** isSosuにfalseを代入 */
		}
		/**
		 * ｊを2で初期化 ｊがiより小さい間繰り返し実行 forブロックを1回実行するたびにｊを１加算
		 */
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {/** iをｊで割った時の余りが0なら */
				isSosu = false;/** isSosuにfalseを代入 */
				break;/** for文から抜ける */
			}
		}
		return isSosu;/** 戻り値としてisSosuを返す */
	}

	/**
	 * コンソールにメッセージを表示するためのメソッド
	 *
	 * @param i
	 *            整数値
	 * @param isSosu
	 *            判定のための論理値
	 */
	static void message(int i, boolean isSosu) {
		System.out.print(i);/** iに代入されている整数値を表示 */
		System.out.println(isSosu);/** isSosuに代入されている論理値を表示 */
	}

}
