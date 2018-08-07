package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private static List<Tramp> playerhand = new ArrayList<Tramp>();
	private static int playerpoint;
	private static Tramp playerdrawcard;
	private static String name = "プレイヤー";

	public void isDraw(Tramp drawcard,List<Tramp> hand) {
		drawcard = TrampCreate.getTrampBundle().remove(0);
		hand.add(drawcard);
	}

	public void isPoint(int point,List<Tramp> hand) {
		point += hand.remove(0).getTrampPoint();
	}

	public void drawMessage(String humanname, Tramp trampname) {
		System.out.println(humanname + "は" + trampname + "を引きました");
	}

	public void pointMessege(String humanname, int point) {
		System.out.println(humanname + "のポイントは" + point + "です。");
	}

}
