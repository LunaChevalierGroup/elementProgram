package samplePackage;


/**
 * トランプのマークの列挙型クラス
 *
 * @author dfjkyrcq
 */
public enum TrampMark {
	/** トランプのマークを列挙 */
	heart("HERAT"),
	dia("DIA"),
	spade("SPADE"),
	club("CLUB");

	// String型の変数trampmarkを宣言
	private final String trampmark;

	/**
	 * String型のtrampmarkを引数に取るコンストラクタを定義
	 *
	 * @author dfjkyrcq
	 * @param trampmark
	 *            トランプのマーク
	 */
	private TrampMark(String trampmark) {
		this.trampmark = trampmark;
	}

	/**
	 * trampmarkのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return トランプのマーク
	 */
	public String getTrampMark() {
		return trampmark;
	}

}