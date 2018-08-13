package samplePackage;

import java.util.Scanner;

public class BlackJackMain {

	public static void main(String[] args) {
		BlackJack blackjack = new BlackJack();
		Player player = new Player();
		Dealer dealer = new Dealer();

		player.setPlayerPoint(0);
		dealer.setDealerPoint(0);

		blackjack.trampBundleCreate();
		blackjack.trampShuffle();

		for (int i = 1; i <= 2; i++) {
			player.setPlayerDrawCard(blackjack.isDraw(player.getPlayerDrawCard(), player.getPlayerHand()));
			player.setPlayerPoint(blackjack.isPoint(player.getPlayerPoint(), player.getPlayerHand()));
			blackjack.drawMessage(player.getPlayerName(), player.getPlayerDrawCard());
			blackjack.pointMessage(player.getPlayerName(), player.getPlayerPoint());
			blackjack.lineShow();
		}

		dealer.setDealerDrawCard(blackjack.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
		dealer.setDealerPoint(blackjack.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
		blackjack.drawMessage(dealer.getDealerName(), dealer.getDealerDrawCard());
		blackjack.pointMessage(dealer.getDealerName(), dealer.getDealerPoint());
		blackjack.lineShow();

		dealer.setDealerDrawCard(blackjack.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
		dealer.setDealerPoint(blackjack.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
		dealer.dealerSecondMessage();
		blackjack.lineShow();

		player.isDrawSelectMessage();
		Scanner sc = new Scanner(System.in);
		while (sc.next().equals("y")) {
			player.setPlayerDrawCard(blackjack.isDraw(player.getPlayerDrawCard(), player.getPlayerHand()));
			player.setPlayerPoint(blackjack.isPoint(player.getPlayerPoint(), player.getPlayerHand()));
			blackjack.drawMessage(player.getPlayerName(), player.getPlayerDrawCard());
			blackjack.pointMessage(player.getPlayerName(), player.getPlayerPoint());
			blackjack.isBurst(player.getPlayerPoint(), player.getPlayerName());
			blackjack.lineShow();
			player.isDrawSelectMessage();
		}
		sc.close();
		// dealer.isDrawRepeat();

		while (dealer.getDealerPoint() < 17) {
			blackjack.lineShow();
			dealer.setDealerDrawCard(blackjack.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
			dealer.setDealerPoint(blackjack.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
			blackjack.drawMessage(dealer.getDealerName(), dealer.getDealerDrawCard());
			blackjack.pointMessage(dealer.getDealerName(), dealer.getDealerPoint());

		}
		// dealer.dealerDraw();
		blackjack.isBurst(dealer.getDealerPoint(), dealer.getDealerName());

		blackjack.pointShow(player.getPlayerPoint(), dealer.getDealerPoint());
		blackjack.battleJudge(player.getPlayerPoint(), dealer.getDealerPoint());

	}

}
