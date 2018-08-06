package samplePackage;

/**Collectionsクラスをインポート*/
import java.util.Collections;
/** Listクラスをインポート */
import java.util.List;

public class TrampCreate extends CardDraw {
	/** Tramp[]型の配列 trampにenum Trampの配列を代入 */
	Tramp[] tramp = Tramp.values();

	/**
	 * トランプ52枚を束にしてシャッフルするメソッド
	 *
	 * @param i
	 *            for文で用いる変数
	 * @param tlist
	 *            トランプ52枚を格納する変数
	 */
	void trampcreate(int i, List<Tramp> tlist) {

		/**
		 * 変数iを0で初期化。
		 * trampに格納されている配列の長さより小さい間
		 * インクリメントしながら繰り返し
		 */
		for (i = 0; i < tramp.length; i++) {
			/** trampの配列をtlistに追加する */
			tlist.add(tramp[i]);
		}
		/** tlistの要素をシャッフルする */
		Collections.shuffle(tlist);
	}
}
