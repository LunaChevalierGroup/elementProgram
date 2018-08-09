package samplePackage;

public class BlackJack {

	public void BattleJudge(int playerpoint, int dealerpoint) {

		if (playerpoint >= dealerpoint) {
			System.out.println("プレイヤーの勝ち");
		} else {
			System.out.println("プレイヤーの負け");
		}

	}

}
