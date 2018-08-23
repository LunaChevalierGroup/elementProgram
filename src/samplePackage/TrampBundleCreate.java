package samplePackage;

//ArrayListクラスのインポート
import java.util.ArrayList;
//Collectionsクラスのインポート
import java.util.Collections;
//Listクラスのインポート
import java.util.List;

/**
 * トランプの束を作成するクラス
 *
 * @author dfjkyrcq
 */
public class TrampBundleCreate {
	// List<Tramp>型の変数trampbundleにArrayList<Tramp>クラスのインスタンスを生成
	private List<Tramp> trampbundle = new ArrayList<Tramp>();
	// TrampPointクラスのenum定数の配列でTrampPoint[]型の変数tramppointを初期化
	private TrampPoint[] tramppoint = TrampPoint.values();
	// TrampMarkクラスのenum定数の配列でTrampMark[]型の変数trampmarkを初期化
	private TrampMark[] trampmark = TrampMark.values();

	/**
	 * 変数trampbundleのセッタ
	 *
	 * @author dfjkyrcq
	 *
	 * @param trampbundle
	 *            トランプの束
	 */
	public void setTrampBundle(List<Tramp> trampbundle) {
		this.trampbundle = trampbundle;
	}

	/**
	 * 変数trampbundleのゲッタ
	 *
	 * @author dfjkyrcq
	 *
	 * @return トランプの束
	 */
	public List<Tramp> getTrampBundle() {
		return trampbundle;
	}

	/**
	 * トランプ束を作成するメソッド
	 *
	 * @author dfjkyrcq
	 * @param tramppoint[i]
	 *            tramppointの配列の要素
	 * @param trampmark[j]
	 *            trampmarkの配列の要素
	 *
	 */
	public void trampBundleCreate() {
		// 変数tramppointのlengthよりiが小さい間繰り返す
		for (int i = 0; i < tramppoint.length; i++) {
			// 変数trampmarkのlengthよりjが小さい間繰り返す
			for (int j = 0; j < trampmark.length; j++) {
				// Trampクラスのインスタンスを生成し、引数としてtramppointとtrampmarkの配列の要素を渡す
				Tramp tramp = new Tramp(tramppoint[i], trampmark[j]);
				// trampbundleにtrampを追加する
				trampbundle.add(tramp);
			}

		}
	}

	/**
	 * トランプ束をシャッフルするメソッド
	 *
	 * @author dfjkyrcq
	 *
	 */
	public void trampShuffle() {
		// trampbundleをシャッフルする
		Collections.shuffle(trampbundle);
	}
}
