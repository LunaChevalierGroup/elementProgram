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

		for (int i = 0; i < tramp.length; i++) {
			tlist.add(tramp[i]);
		}
		for (int i = 1; i <= 2; i++) {
			Tramp player = tlist.remove(0);
			plist.add(player);
			System.out.println(i + "枚目プレイヤーは" + player + "を引きました");
		}
		for (int i = 1; i <= 2; i++) {
			if (i == 2) {
				Tramp dealer = tlist.remove(0);
				dlist.add(dealer);
				System.out.println(i + "枚目ディーラーが引いたカードは非表示です。");
			} else {
				Tramp dealer = tlist.remove(0);
				dlist.add(dealer);
				System.out.println(i + "枚目ディーラーは" + dealer + "を引きました");
			}
		}
		System.out.println("カードを引きますか？（はい：Yを入力、いいえ：それ以外を入力）");
		String select = sc.nextLine();
		if(select=="Y"){
			Tramp player = tlist.remove(0);
			plist.add(player);
			System.out.println("プレイヤーは" + player + "を引きました");
		}else{}
		// for (Tramp a : tlist) {
		// System.out.println(a);
		// }
		// for (Tramp a : plist) {
		// System.out.println(a);
		// }
		sc.close();
	}

}
