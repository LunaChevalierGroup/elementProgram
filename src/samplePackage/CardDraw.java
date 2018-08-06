package samplePackage;

/**ArrayListクラスをインポート*/
import java.util.ArrayList;
/**Listクラスをインポート*/
import java.util.List;

/** トランプを引くクラス */
public class CardDraw {
	/** List<Tramp>型の変数tlistにArrayList<Tramp>のインスタンスを生成 */
	List<Tramp> tramplist = new ArrayList<Tramp>();
	/** List<Tramp>型の変数plistにArrayList<Tramp>のインスタンスを生成 */
	List<Tramp> playerlist = new ArrayList<Tramp>();
	/** List<Tramp>型の変数dlistにArrayList<Tramp>のインスタンスを生成 */
	List<Tramp> dealerlist = new ArrayList<Tramp>();
	/** プレイヤーのポイントを代入する変数を宣言 */
	int playerpoint;
	/** ディーラのポイントを代入する変数を宣言 */
	int dealerpoint;
	/** if文やfor文等で用いる変数を宣言 */
	int i;
	/** プレイヤーの引いたトランプを代入する変数を宣言 */
	Tramp player;
	/** ディーラーの引いたトランプを代入する変数を宣言 */
	Tramp dealer;

	/** プレイヤーがトランプを引く時の処理を記述したメソッド */
	void playerdraw() {
		/** tlistから0番目の要素を取得し取り除き、取得した要素をplayerに代入する */
		player = tramplist.remove(0);
		/** playerに代入されているトランプをplistに追加 */
		playerlist.add(player);
		/** plistから0番目の要素を取得し取り除き、取得したトランプのポイントをppに代入 */
		playerpoint += playerlist.remove(0).getTrampNum();
		/** 文字列の表示 */
		System.out.println("プレイヤーは" + player + "を引きました");
		/** 文字列の表示 */
		System.out.println("プレイヤーのポイントは" + playerpoint);
	}

	/** ディーラーがトランプを引く時の処理を記述したメソッド */
	void dealerdraw() {
		/** tlistから0番目の要素を取得し取り除き、取得した要素をdealerに代入する */
		dealer = tramplist.remove(0);
		/** dealerに代入されているトランプをdlistに追加 */
		dealerlist.add(dealer);
		/** dlistから0番目の要素を取得し取り除き、取得したトランプのポイントをdpに代入 */
		dealerpoint += dealerlist.remove(0).getTrampNum();
	}
}
