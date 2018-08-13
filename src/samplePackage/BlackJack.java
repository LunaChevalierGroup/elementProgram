package samplePackage;

import java.util.List;

public class BlackJack extends TrampCreate {

	public Tramp isDraw(Tramp drawcard, List<Tramp> hand) {
		drawcard = getTrampBundle().remove(0);
		hand.add(drawcard);
		return drawcard;
	}

	public int isPoint(int point, List<Tramp> hand) {
		point += hand.remove(0).getTrampPoint();
		return point;
	}

	public void drawMessage(String humanname, Tramp drawcard) {
		System.out.println(humanname + "は" + drawcard + "を引きました");
	}

	public void pointMessage(String humanname, int point) {
		System.out.println(humanname + "のポイントは" + point + "です。");
	}

	public void isBurst(int point, String humanname) {
		if (point > 21) {
			lineShow();
			System.out.println(humanname + "がバースト");
			System.exit(0);
		}
	}

	public void pointShow(int playerpoint, int dealerpoint) {
		lineShow();
		System.out.println("プレイヤーのポイントは" + playerpoint + "です。");
		System.out.println("ディーラーのポイントは" + dealerpoint + "です。");
	}

	public void battleJudge(int playerpoint, int dealerpoint) {

		if (playerpoint >= dealerpoint) {
			System.out.println("プレイヤーの勝ち");
		} else {
			System.out.println("プレイヤーの負け");
		}

	}

	public void lineShow() {
		System.out.println("------------------------------------------------");
	}
}
