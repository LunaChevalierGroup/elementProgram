package samplePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carddraw {

	Scanner sc = new Scanner(System.in);
	List<Tramp> tlist = new ArrayList<Tramp>();
	List<Tramp> plist = new ArrayList<Tramp>();
	List<Tramp> dlist = new ArrayList<Tramp>();
	Tramp[] tramp = Tramp.values();
	int pp;
	int dp;
	int i;
	Tramp dealer;

	void pdraw() {
		Tramp player = tlist.remove(0);
		plist.add(player);
		pp += plist.remove(0).getTrampNum();
		System.out.println("プレイヤーは" + player + "を引きました");
		System.out.println("プレイヤーのポイントは"+pp);
	}

	void ddraw() {
		dealer = tlist.remove(0);
		dlist.add(dealer);
		dp += dlist.remove(0).getTrampNum();

	}
}
