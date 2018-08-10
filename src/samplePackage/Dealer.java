package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends BlackJack {
	private  List<Tramp> dealerhand = new ArrayList<Tramp>();
	private  int dealerpoint;
	private  Tramp dealerdrawcard;
	private final  String dealername = "ディーラー";

	public void setDealerHand(List<Tramp> dealerhand) {
		this.dealerhand = dealerhand;
	}

	public void setDealerPoint(int dealerpoint) {
		this.dealerpoint = dealerpoint;
	}

	public void setDealerDrawCard(Tramp dealerdrawcard) {
		this.dealerdrawcard = dealerdrawcard;
	}

	public  List<Tramp> getDealerHand() {
		return dealerhand;
	}

	public int getDealerPoint() {
		return dealerpoint;
	}

	public Tramp getDealerDrawCard() {
		return dealerdrawcard;
	}

	public String getDealerName() {
		return dealername;
	}

	public void dealerSecondMessage() {
		System.out.println("2枚目" + dealername + "が引いたカードは非表示です。");
	}

	public void dealerDraw() {
		while (dealerpoint < 17) {
			setDealerDrawCard(isDraw(dealerdrawcard, dealerhand));
			setDealerPoint(isPoint(dealerpoint, dealerhand));
			lineShow();
			drawMessage(dealername, dealerdrawcard);
			pointMessage(dealername, dealerpoint);
		}
	}
}
