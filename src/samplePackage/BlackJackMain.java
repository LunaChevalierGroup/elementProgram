package samplePackage;

public class BlackJackMain {

	public static void main(String[] args) {
		Player player = new Player();
		Dealer dealer = new Dealer();
		BlackJack blackjack = new BlackJack();
		player.setPlayerPoint(0);
		dealer.setDealerPoint(0);

		blackjack.trampBundleCreate();
		blackjack.trampShuffle();

		for (int i = 1; i <= 2; i++) {
			player.setPlayerDrawCard(player.isDraw(player.getPlayerDrawCard(), player.getPlayerHand()));
			player.setPlayerPoint(player.isPoint(player.getPlayerPoint(), player.getPlayerHand()));
			player.drawMessage(player.getPlayerName(), player.getPlayerDrawCard());
			player.pointMessage(player.getPlayerName(), player.getPlayerPoint());
			player.lineShow();
		}

		dealer.setDealerDrawCard(dealer.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
		dealer.setDealerPoint(dealer.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
		dealer.drawMessage(dealer.getDealerName(), dealer.getDealerDrawCard());
		dealer.pointMessage(dealer.getDealerName(), dealer.getDealerPoint());
		dealer.lineShow();

		dealer.setDealerDrawCard(dealer.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
		dealer.setDealerPoint(dealer.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
		dealer.dealerSecondMessage();
		dealer.lineShow();

		player.isDrawSelectMessage();
		player.isDrawRepeat();

		dealer.dealerDraw();
		dealer.isBurst(player.getPlayerPoint(), dealer.getDealerName());

		blackjack.pointShow(player.getPlayerPoint(), dealer.getDealerPoint());
		blackjack.battleJudge(player.getPlayerPoint(), dealer.getDealerPoint());

	}

}
