package blackjack.game;

import blackjack.human.Dealer;
import blackjack.human.User;
import blackjack.trump.Card;
import blackjack.trump.Deck;

/**
 * ゲームを管理するクラス
 * @author LunaC
 *
 */
public class Game {
	/**
	 * ゲームをプレイする
	 * @author LunaC
	 *
	 */
	public void play(){
		// ゲームの初期化
		// トランプデッキを作成し，シャッフル
		Deck deck = new Deck();
		deck.shuffle();

		Dealer dealer = new Dealer();
		User user = new User();

		// ユーザー，ディーラーにカードを2枚ずつ配る
		// ユーザー1枚目
		Card card = deck.getDeck().remove(0);
		user.draw(card);
		System.out.println(user.getNoticeDrawCard(card));

		// ユーザー2枚目
		card = deck.getDeck().remove(0);
		user.draw(card);
		System.out.println(user.getNoticeDrawCard(card));

		// ディーラー1枚目
		card = deck.getDeck().remove(0);
		dealer.draw(card);
		System.out.println(dealer.getNoticeDrawCard(card));

		// ディーラー2枚目
		// 2枚目は伏せる
		card = deck.getDeck().remove(0);
		dealer.draw(card);
		System.out.println(dealer.getName() + "の2枚めのカードは不明です");

		// ユーザーのポイントを表示
		System.out.println(user.getNoticePoint());

		// ユーザーのターンを実行
		user.turn(deck);

		// ユーザーが敗北していなければ，ディーラーのターンを実行
		if(!user.isLose()){
			System.out.println(dealer.getName() + "の2枚めのカードは" + dealer.getSecondDrawCard().getPrintCard() + "でした");
			System.out.println(dealer.getNoticePoint());
			dealer.turn(deck);
		}

		// 勝敗判定
		if(isDraw(dealer, user)){
			System.out.print("引き分けです");
		} else if (user.isLose() || (!user.isLose() && !dealer.isLose() && isLosePlayer(dealer, user))) {
			System.out.print("あなたの負けです");
		} else {
			System.out.print("あなたの勝ちです");
		}
	}

	private boolean isLosePlayer(Dealer dealer, User user){
		return dealer.getPoint() > user.getPoint();
	}

	private boolean isDraw(Dealer dealer, User user){
		return dealer.getPoint() == user.getPoint();
	}
}
