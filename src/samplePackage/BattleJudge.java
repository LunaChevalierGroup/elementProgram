package samplePackage;

public class BattleJudge extends CardDraw {

	int dp21;

	void dpjudge(int dp) {
		if (dp < 21) {
			dp21 = 21 - dp;
		} else if (dp >= 21) {
			dp21 = dp - 21;
		}
	}

	void battlejudge(int pp) {
		if (21 - pp <= dp21) {
			System.out.println("プレイヤーの勝ち");
		} else {
			System.out.println("プレイヤーの負け");
		}
	}

}
