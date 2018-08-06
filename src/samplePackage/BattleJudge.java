package samplePackage;

/** 勝敗を判定するクラス */
public class BattleJudge {
	/** ディーラーのポイントと21との差を計算した値を代入する変数 */
//	int dp21;

	/**
	 * ディーラーのポイントと21との差を計算するメソッド
	 *
	 * @param dp
	 *            ディーラーのポイント
	 */
//	void dpjudge(int dp) {
//		/** ディーラのポイントが21より小さい時 */
//		if (dp < 21) {
//			/** dp21に21からディーラーのポイントを引いた数を代入 */
//			dp21 = 21 - dp;
//		}
//		/** ディーラのポイントが21以上の時 */
//		else if (dp >= 21) {
//			/** dp21にディーラーのポイントから21を引いた数を代入 */
//			dp21 = dp - 21;
//		}
//	}

	/**
	 * 勝敗を判定するメソッド
	 *
	 * @param playerpoint
	 *            プレイヤーのポイント
	 */
	void battlejudge(int playerpoint, int dealerpoint) {
		/** プレイヤーのポイントと21との差がディーラのポイントと21との差以下である時 */
		if (playerpoint >= dealerpoint || playerpoint >= 42 - dealerpoint) {
			/** 文字列の表示 */
			System.out.println("プレイヤーの勝ち");
		} else {
			/** 文字列の表示 */
			System.out.println("プレイヤーの負け");
		}
	}

}
