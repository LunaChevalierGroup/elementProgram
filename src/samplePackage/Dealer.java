package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
	private static List<Tramp> dealerhand = new ArrayList<Tramp>();
	private static int dealerpoint;
	private static Tramp dealerdrawcard;
	private final static String dealername = "ディーラー";

	public static void setDealerHand(List<Tramp> dealerhand) {
		Dealer.dealerhand = dealerhand;
	}

	public static void setDealerPoint(int dealerpoint) {
		Dealer.dealerpoint = dealerpoint;
	}

	public void setDealerDrawCrad(Tramp dealerdrawcard) {
		Dealer.dealerdrawcard = dealerdrawcard;
	}

	public static void dealerSecondMessage() {
		System.out.println("2枚目" + dealername + "が引いたカードは非表示です。");
	}

	public static List<Tramp> getDealerhand() {
		return dealerhand;
	}

	public static int getDealerPoint() {
		return dealerpoint;
	}

	public Tramp getDealerDrawCard() {
		return dealerdrawcard;
	}

	public String getDealerName() {
		return dealername;
	}

	public void dealerDraw() {
		while (dealerpoint < 17) {
			BlackJack.isDraw(dealerdrawcard, dealerhand);
			BlackJack.isPoint(dealerpoint, dealerhand);
			BlackJack.drawMessage(dealername, dealerdrawcard);
			BlackJack.pointMessage(dealername, dealerpoint);
		}
	}
}
