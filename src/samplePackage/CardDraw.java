package samplePackage;

import java.util.ArrayList;
import java.util.List;

public class CardDraw {

	List<Tramp> tlist = new ArrayList<Tramp>();
	List<Tramp> plist = new ArrayList<Tramp>();
	List<Tramp> dlist = new ArrayList<Tramp>();
	int pp;
	int dp;
	int i;
	Tramp dealer;
	Tramp player;

	void pdraw() {
		player = tlist.remove(0);
		plist.add(player);
		pp += plist.remove(0).getTrampNum();
		System.out.println("プレイヤーは" + player + "を引きました");
		System.out.println("プレイヤーのポイントは" + pp);
	}

	void ddraw() {
		dealer = tlist.remove(0);
		dlist.add(dealer);
		dp += dlist.remove(0).getTrampNum();
	}
}
