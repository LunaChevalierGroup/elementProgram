package samplePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Tramp> tlist = new ArrayList<Tramp>();
		List<Tramp> plist = new ArrayList<Tramp>();
		List<Tramp> dlist = new ArrayList<Tramp>();
		Tramp[] tramp = Tramp.values();
		int pp = 0;
		int dp = 0;
		for (int i = 0; i < tramp.length; i++) {
			tlist.add(tramp[i]);
		}

		for (int i = 1; i <= 2; i++) {
			Tramp player = tlist.remove(0);
			plist.add(player);
			pp = pp + plist.remove(0).getTrampNum();
			System.out.println(i + "枚目プレイヤーは" + player + "を引きました");

			if (i == 2) {
				Tramp dealer = tlist.remove(0);
				dlist.add(dealer);
				dp = dp + dlist.remove(0).getTrampNum();
				System.out.println(i + "枚目ディーラーが引いたカードは非表示です。");
			} else {
				Tramp dealer = tlist.remove(0);
				dlist.add(dealer);
				dp = dp + dlist.remove(0).getTrampNum();
				System.out.println(i + "枚目ディーラーは" + dealer + "を引きました");
			}
		}

		System.out.println(pp);
		System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");
		while (sc.next().equals("y")) {

			Tramp player = tlist.remove(0);
			plist.add(player);
			pp = pp + plist.remove(0).getTrampNum();
			System.out.println(pp);
			System.out.println("プレイヤーは" + player + "を引きました");
			if (pp > 21) {
				System.out.println("バースト（負け）");
				break;
			}
			System.out.println("カードを引きますか？（はい：yを入力、いいえ：それ以外を入力）");
		}
		while (dp < 17) {
			Tramp dealer = tlist.remove(0);
			dlist.add(dealer);
			dp = dp + dlist.remove(0).getTrampNum();
			System.out.println("ディーラーが引いたカードは非表示です。");
		}
		System.out.println(dp);
		sc.close();
	}
}