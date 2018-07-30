package samplePackage;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carddraw cd = new Carddraw();
		BattleJudge bj = new BattleJudge();
		TrampCreate tc = new TrampCreate();
		cd.pp = 0;
		cd.dp = 0;

		tc.trampcreate(cd.i, cd.tlist);

		for (cd.i = 1; cd.i <= 2; cd.i++) {

			cd.pdraw();

			if (cd.i == 2) {
				cd.ddraw();
				System.out.println(cd.i + "枚目ディーラーが引いたカードは非表示です。");
			} else {
				cd.ddraw();
				System.out.println("ディーラーは" + cd.dealer + "を引きました");
			}
		}

		System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");

		a: {
			while (sc.next().equals("y")) {

				cd.pdraw();

				if (cd.pp > 21) {
					System.out.println("バースト（プレイヤーの負け）");
					break a;
				}

				System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");
			}

			while (cd.dp < 17) {
				cd.ddraw();
			}

			System.out.println("ディーラーのポイントは" + cd.dp);

			bj.dp21 = 0;

			bj.dpjudge(cd.dp);
			bj.battlejudge(cd.pp);
		}
		sc.close();
	}
}