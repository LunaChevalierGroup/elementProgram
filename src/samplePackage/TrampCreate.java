package samplePackage;

import java.util.Collections;/**Collectionsクラスをインポート*/
import java.util.List;

/** Listクラスをインポート */

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
		for (i = 0; i < tramp.length; i++) {/**
											 * 変数iを0で初期化。
											 * trampに格納されている配列の長さより小さい間
											 * インクリメントしながら繰り返し
											 */
			tlist.add(tramp[i]);/** trampの配列をtlistに追加する */
		}
		Collections.shuffle(tlist);/** tlistの要素をシャッフルする */
	}
}
