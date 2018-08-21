package samplePackage;

/**
 * トランプの列挙型クラス
 *
 * @author dfjkyrcq
 */
	public enum TrampPoint {

     one(1,"A"),
     two(2,"2"),
     three(3,"3"),
     four(4,"4"),
     five(5,"5"),
     six(6,"6"),
     seven(7,"7"),
     eight(8,"8"),
     nine(9,"9"),
     ten(10,"10"),
     eleven(10,"J"),
     twelve(10,"Q"),
     thirteen(10,"K");

	// トランプのpointを宣言
	private final int point;
	private final String numbermark;

	/**
	 * int型のpointを引数に取るコンストラクタを定義
	 *
	 * @param point
	 *            トランプのポイント
	 */
	private TrampPoint(int point, String numbermark) {
		this.point = point;
		this.numbermark = numbermark;
	}

	/**
	 * int型のpointを戻り値として返すメソッド
	 *
	 * @return トランプのポイント
	 */
	public int getTrampPoint() {
		return point;
	}

	/**
	 * int型のpointを戻り値として返すメソッド
	 *
	 * @return トランプのポイント
	 */
	public String getTrampNumber() {
		return numbermark;
	}
}
