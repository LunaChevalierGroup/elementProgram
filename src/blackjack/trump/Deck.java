package blackjack.trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ゲームで使用するデッキクラス
 * @author LunaC
 *
 */
public class Deck {
	private List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for(int i = 0; i < Number.values().length; i++){
			for(int j = 0; j < Suit.values().length; j++){
				Card card = new Card(Suit.values()[j], Number.values()[i]);
				this.deck.add(card);
			}
		}
	}

	public List<Card> getDeck(){
		return deck;
	}

	/**
	 * デッキをシャッフルする
	 * @author LunaC
	 *
	 */
	public void shuffle(){
		Collections.shuffle(deck);
	}
}
