package samplePackage;

import java.util.Collections;

public class BlackJack {

	public static void main(String[] args) {
		Carddraw cd = new Carddraw();
		cd.pp = 0;
		cd.dp = 0;
		for (cd.i = 0; cd.i < cd.tramp.length; cd.i++) {
			cd.tlist.add(cd.tramp[cd.i]);
		}
		Collections.shuffle(cd.tlist);
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
			while (cd.sc.next().equals("y")) {
				cd.pdraw();
				if (cd.pp > 21) {
					System.out.println("バースト（負け）");
					break a;
				}
				System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");
			}
			while (cd.dp < 17) {
				cd.ddraw();
			}
			System.out.println("ディーラーのポイントは" + cd.dp);
			int dp21 = 0;
			if (cd.dp < 21) {
				dp21 = 21 - cd.dp;
			} else if (cd.dp >= 21) {
				dp21 = cd.dp - 21;
			}
			if (21 - cd.pp <= dp21) {
				System.out.println("プレイヤーの勝ち");
			} else {
				System.out.println("プレイヤーの負け");
			}
		}
		cd.sc.close();
	}
}
