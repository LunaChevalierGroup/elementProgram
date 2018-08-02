package samplePackage;

import java.util.ArrayList;/**ArrayListクラスをインポート*/
/**Listクラスをインポート*/
import java.util.List;

/** トランプを引くクラス */
public class CardDraw {
	/** List<Tramp>型の変数tlistにArrayList<Tramp>のインスタンスを生成 */
	List<Tramp> tlist = new ArrayList<Tramp>();
	/** List<Tramp>型の変数plistにArrayList<Tramp>のインスタンスを生成 */
	List<Tramp> plist = new ArrayList<Tramp>();
	/** List<Tramp>型の変数dlistにArrayList<Tramp>のインスタンスを生成 */
	List<Tramp> dlist = new ArrayList<Tramp>();
	/** プレイヤーのポイントを代入する変数を宣言 */
	int pp;
	/** ディーラのポイントを代入する変数を宣言 */
	int dp;
	/** if文やfor文等で用いる変数を宣言 */
	int i;
	/** プレイヤーの引いたトランプを代入する変数を宣言 */
	Tramp player;
	/** ディーラーの引いたトランプを代入する変数を宣言 */
	Tramp dealer;

	/** プレイヤーがトランプを引く時の処理を記述したメソッド */
	void pdraw() {
		/** tlistから0番目の要素を取得し取り除き、取得した要素をplayerに代入する */
		player = tlist.remove(0);
		/** playerに代入されているトランプをplistに追加 */
		plist.add(player);
		/** plistから0番目の要素を取得し取り除き、取得したトランプのポイントをppに代入 */
		pp += plist.remove(0).getTrampNum();
		System.out.println("プレイヤーは" + player + "を引きました");/** 文字列の表示 */
		System.out.println("プレイヤーのポイントは" + pp);/** 文字列の表示 */
	}

	/** ディーラーがトランプを引く時の処理を記述したメソッド */
	void ddraw() {
		/** tlistから0番目の要素を取得し取り除き、取得した要素をdealerに代入する */
		dealer = tlist.remove(0);
		/** dealerに代入されているトランプをdlistに追加 */
		dlist.add(dealer);
		/** dlistから0番目の要素を取得し取り除き、取得したトランプのポイントをdpに代入 */
		dp += dlist.remove(0).getTrampNum();
	}
}
