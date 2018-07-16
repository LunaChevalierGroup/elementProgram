package blackjack.trump;

/**
 * トランプのカードのクラス
 * @author LunaC
 *
 */
public class Card {
	private Suit suit;
	private Number number;

	public Card(Suit suit, Number number) {
		this.suit = suit;
		this.number = number;
	}

	public Number getNumber(){
		return number;
	}

	/**
	 * カードのスートを文字列として取得する
	 * @author LunaC
	 * @return String アイコン
	 *
	 */
	private String getSuitIcon(){
		return suit.getIcon();
	}

	/**
	 * カードのランクを文字列として取得する
	 * @author LunaC
	 * @return String アイコン
	 *
	 */
	private String getRank(){
		return number.getRank();
	}


	/**
	 * 表示用のカードの情報を取得する
	 * @author LunaC
	 * @return String アイコン
	 *
	 */
	public String getPrintCard(){
		return getSuitIcon() + "の" + getRank();
	}
}
