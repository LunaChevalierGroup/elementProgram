package blackjack.trump;

/**
 * トランプのスートの列挙
 * @author LunaC
 *
 */
public enum Suit {
	SPADE("spade", "スペード", "♠"),
	CLOVER("clover", "クローバー", "♣"),
	DIA("dia", "ダイヤ", "◆"),
	HEART("heart", "ハート", "♥");

	private String english;
	private String japanese;
	private String icon;

	private Suit(String english, String japanese, String icon) {
		this.english = english;
		this.japanese = japanese;
		this.icon = icon;
	}

	public String getEnglish(){
		return english;
	}

	public String getJapanese(){
		return japanese;
	}

	public String getIcon(){
		return icon;
	}
}
