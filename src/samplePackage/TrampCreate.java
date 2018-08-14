package samplePackage;

/**ArrayListクラスをインポート*/
import java.util.ArrayList;
/**Collectionsクラスをインポート*/
import java.util.Collections;
/**Listクラスをインポート*/
import java.util.List;

/**
 * トランプを作成するクラス
 *
 * @author dfjkyrcq
 *
 */
public class TrampCreate {
	/** List<Tramp>型の変数trampbundleにArrayList<Tramp>クラスのインスタンスを生成 */
	private List<Tramp> trampbundle = new ArrayList<Tramp>();
	/** Tramp[]型の配列 trampにenum Trampの配列を代入 */
	private Tramp[] tramp = Tramp.values();

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
	 * 変数trampのセッタ
	 *
	 * @author dfjkyrcq
	 *
	 * @param tramp
	 *            トランプの配列
	 */
	public void setTramp(Tramp[] tramp) {
		this.tramp = tramp;
	}

	/**
	 * 変数trampbundleのゲッタ
	 *
	 * @author dfjkyrcq
	 *
	 * @return trampbundle
	 */
	public List<Tramp> getTrampBundle() {
		return trampbundle;
	}

	/**
	 * 変数trampのゲッタ
	 *
	 * @author dfjkyrcq
	 *
	 * @return tramp
	 */
	public Tramp[] getTramp() {
		return tramp;
	}

	/**
	 * トランプ束を作成するメソッド
	 *
	 * @author dfjkyrcq
	 *
	 */
	public void trampBundleCreate() {
		/** 変数trampのlengthよりiが小さい間繰り返す */
		for (int i = 0; i < tramp.length; i++) {
			/** trampbundleにtrampを代入する */
			trampbundle.add(tramp[i]);
		}
	}

	/**
	 * トランプ束をシャッフルするメソッド
	 *
	 * @author dfjkyrcq
	 *
	 */
	public void trampShuffle() {
		/** trampbundleをシャッフルする */
		Collections.shuffle(trampbundle);
	}

}
