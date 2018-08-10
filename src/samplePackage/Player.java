package samplePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends BlackJack {
	private List<Tramp> playerhand = new ArrayList<Tramp>();
	private int playerpoint;
	private Tramp playerdrawcard;
	private final String playername = "プレイヤー";

	public void setPlayerHand(List<Tramp> playerhand) {
		this.playerhand = playerhand;
	}

	public void setPlayerPoint(int playerpoint) {
		this.playerpoint = playerpoint;
	}

	public void setPlayerDrawCard(Tramp playerdrawcard) {
		this.playerdrawcard = playerdrawcard;
	}

	public List<Tramp> getPlayerHand() {
		return playerhand;
	}

	public int getPlayerPoint() {
		return playerpoint;
	}

	public Tramp getPlayerDrawCard() {
		return playerdrawcard;
	}

	public String getPlayerName() {
		return playername;
	}

	public void isDrawSelectMessage() {
		System.out.println("カードを引きますか？(はい：yを入力、いいえ：それ以外を入力)");
	}

	public void isDrawRepeat() {
		Scanner sc = new Scanner(System.in);
		while (sc.next().equals("y")) {
			setPlayerDrawCard(isDraw(playerdrawcard, playerhand));
			setPlayerPoint(isPoint(playerpoint, playerhand));
			drawMessage(playername, playerdrawcard);
			pointMessage(playername, playerpoint);
			isBurst(playerpoint,playername);
			lineShow();
			isDrawSelectMessage();
		}
		sc.close();
	}

}
