package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Player {
	private List<Tramp> dealerhand = new ArrayList<Tramp>();
	private int dealerpoint;
	private Tramp dealer;
	private String dealername = "ディーラー";

	public void dealerSecondMessage() {
		System.out.println("2枚目" + dealername + "が引いたカードは非表示です。");
	}

	public void dealerDraw() {
		while (dealerpoint < 17) {
			Player.isDraw(dealer, dealerhand);
			Player.isPoint(dealerpoint, dealerhand);
			Player.drawMessage(dealername, dealer);
			Player.pointMessage(dealername, dealerpoint);
		}
	}
}
