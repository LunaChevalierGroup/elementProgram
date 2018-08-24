package samplePackage;

/**
 * トランプを作成するクラス
 *
 * @author dfjkyrcq
 */
public class Tramp {

	// TrampPointクラスのtramppointを宣言
	private TrampPoint tramppoint;
	// TrampMarkクラスのtrampmarkを宣言
	private TrampMark trampmark;

	/**
	 * TrampPoint型のtramppointとTrampMark型のtrampmarkを引数に取るコンストラクタを定義
	 *
	 * @author dfjkyrcq
	 * @param tramppoint
	 *            tramppointの配列の要素
	 * @param trampmark
	 *            trampmarkの配列の要素
	 */
	public Tramp(TrampPoint tramppoint, TrampMark trampmark) {
		this.tramppoint = tramppoint;
		this.trampmark = trampmark;
	}

	/**
	 * tramppointのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return トランプのポイント
	 */
	public int getTrampPoint() {
		return tramppoint.getTrampPoint();
	}

	/**
	 * trampnumbermarkのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return トランプの英数字
	 */
	public String getTrampNumberMark() {
		return tramppoint.getTrampNumberMark();
	}

	/**
	 * trampmarkのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return トランプのマーク
	 */
	public String getTrampMark() {
		return trampmark.getTrampMark();
	}
}
