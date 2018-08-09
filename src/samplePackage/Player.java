package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private static List<Tramp> playerhand = new ArrayList<Tramp>();
	private static int playerpoint;
	private static Tramp playerdrawcard;
	private final static String playername = "プレイヤー";

	public void setPlayerHand(List<Tramp> playerhand) {
		Player.playerhand =playerhand;
	}

	public static void setPlayerPoint(int playerpoint) {
		Player.playerpoint = playerpoint;
	}

	public void setPlayerDrawCard(Tramp playerdrawcard) {
		Player.playerdrawcard = playerdrawcard;
	}

	public static List<Tramp> getPlayerHand() {
		return playerhand;
	}

	public static int getPlayerPoint() {
		return playerpoint;
	}

	public static Tramp getPlayerDrawCard() {
		return playerdrawcard;
	}

	public static String getPlayerName() {
		return playername;
	}

}
