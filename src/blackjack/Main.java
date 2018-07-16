package blackjack;

import blackjack.game.Game;

/**
 * ブラックジャックをプレイするクラス
 * @author LunaC
 *
 */
public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}
}
