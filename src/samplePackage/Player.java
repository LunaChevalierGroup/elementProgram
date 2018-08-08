package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private static List<Tramp> playerhand = new ArrayList<Tramp>();
	private static int playerpoint;
	private static Tramp playerdrawcard;
	private static String playername = "プレイヤー";

	public String getName() {
		return playername;
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

}
