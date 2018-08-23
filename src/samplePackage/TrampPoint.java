package samplePackage;

/**
 * トランプのポイントの列挙型クラス
 *
 * @author dfjkyrcq
 */
	public enum TrampPoint {
	/** トランプのポイントと文字を列挙 */
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
	// トランプの英数字を宣言
	private final String numbermark;

	/**
	 * int型のpointを引数に取るコンストラクタを定義
	 *
	 * @author dfjkyrcq
	 * @param point
	 *            トランプのポイント
	 * @param numbermark
	 *            トランプの英数字
	 */
	private TrampPoint(int point, String numbermark) {
		this.point = point;
		this.numbermark = numbermark;
	}

	/**
	 * int型のpointを戻り値として返すメソッド
	 *
	 * @author dfjkyrcq
	 * @return トランプのポイント
	 */
	public int getTrampPoint() {
		return point;
	}

	/**
	 * String型のnumbermarkを戻り値として返すメソッド
	 *
	 * @author dfjkyrcq
	 * @return トランプの英数字
	 */
	public String getTrampNumberMark() {
		return numbermark;
	}
}
