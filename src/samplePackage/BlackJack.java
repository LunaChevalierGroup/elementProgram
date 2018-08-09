package samplePackage;

import java.util.List;
import java.util.Scanner;

public class BlackJack {
	Scanner sc = new Scanner(System.in);

	public void isBurst(int playerpoint, int dealerpoint) {
		if (playerpoint > 21) {
			System.out.println("プレイヤーがバースト(プレイヤーの負け)");
			System.exit(0);
		} else if (dealerpoint > 21) {
			System.out.println("ディーラーがバースト(プレイヤーの勝ち)");
			System.exit(0);
		}
	}

	public void BattleJudge(int playerpoint, int dealerpoint) {

		if (playerpoint >= dealerpoint) {
			System.out.println("プレイヤーの勝ち");
		} else {
			System.out.println("プレイヤーの負け");
		}

	}

	public static void isDraw(Tramp drawcard, List<Tramp> hand) {
		drawcard = TrampCreate.getTrampBundle().remove(0);
		hand.add(drawcard);
	}

	public static void isPoint(int point, List<Tramp> hand) {
		point += hand.remove(0).getTrampPoint();
	}

	public static void drawMessage(String humanname, Tramp trampname) {
		System.out.println(humanname + "は" + trampname + "を引きました");
	}

	public static void pointMessage(String humanname, int point) {
		System.out.println(humanname + "のポイントは" + point + "です。");
	}

	public void isDrawSelectMessage() {
		System.out.println("カードを引きますか？(はい：yを入力、いいえ：それ以外を入力)");
	}

	public void isDrawRepeat() {
		while (sc.next().equals("y")) {
			isDraw(Player.getPlayerDrawCard(), Player.getPlayerHand());
			isPoint(Player.getPlayerPoint(), Player.getPlayerHand());
			drawMessage(Player.getPlayerName(), Player.getPlayerDrawCard());
			pointMessage(Player.getPlayerName(), Player.getPlayerPoint());
			isBurst(Player.getPlayerPoint(),Dealer.getDealerPoint());
			isDrawSelectMessage();
		}
	}

}
