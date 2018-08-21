package samplePackage;

public enum TrampMark {

	heart("HERAT"),
	dia("DIA"),
	spade("SPADE"),
	club("CLUB");

	private final String trampmark;

	/**
	 * int型のpointを引数に取るコンストラクタを定義
	 *
	 * @param point
	 *            トランプのポイント
	 */
	private TrampMark(String trampmark) {
		this.trampmark = trampmark;
	}

	/**
	 * int型のpointを戻り値として返すメソッド
	 *
	 * @return トランプのポイント
	 */
	public String getTrampMark() {
		return trampmark;
	}

}
