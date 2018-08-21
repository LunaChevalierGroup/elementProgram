package samplePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrampBundleCreate {
	// List<Tramp>型の変数trampbundleにArrayList<Tramp>クラスのインスタンスを生成
	private List<Tramp> trampbundle = new ArrayList<Tramp>();
	private TrampPoint[] tramppoint = TrampPoint.values();
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
	 *
	 */
	public void trampBundleCreate() {
		// 変数trampのlengthよりiが小さい間繰り返す
		for (int i = 0; i < tramppoint.length; i++) {
			for (int j = 0; j < trampmark.length; j++) {
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
