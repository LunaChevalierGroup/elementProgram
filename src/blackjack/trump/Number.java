package blackjack.trump;

/**
 * トランプの番号の列挙
 * @author LunaC
 *
 */
public enum Number {
	ACE(1, "1"),
	TWO(2, "2"),
	THREE(3, "3"),
	FOUR(4, "4"),
	FIVE(5, "5"),
	SIX(6, "6"),
	SEVEN(7, "7"),
	EIGHT(8, "8"),
	NINE(9, "9"),
	TEN(10, "10"),
	JACK(10, "J"),
	QUEEN(10, "Q"),
	KING(10, "K");

	private int point;
	private String rank;

	private Number(int point, String rank) {
		this.point = point;
		this.rank = rank;
	}

	public int getPoint() {
		return point;
	}

	public String getRank(){
		return rank;
	}
}
