package samplePackage;

//Listクラスのインポート
import java.util.List;

/**
 * ブラックジャックゲームのクラス
 *
 * @author dfjkyrcq
 */
public class BlackJack extends TrampBundleCreate {
	/**
	 * トランプの束からトランプを引くメソッド
	 *
	 * @author dfjkyrcq
	 * @param drawcard
	 *            引いたカード
	 * @param hand
	 *            手札
	 * @return 引いたカード
	 */
	public Tramp draw(Tramp drawcard, List<Tramp> hand) {
		// トランプの束からトランプを取得し、Listから削除。取得したトランプを変数drawcardに代入
		drawcard = getTrampBundle().remove(0);
		// drawcardをList<Tramp>型のhandに追加する
		hand.add(drawcard);
		return drawcard;
	}

	/**
	 * 引いたトランプのポイントを変数pointに代入する。
	 *
	 * @author dfjkyrcq
	 * @param point
	 *            引いたトランプのポイント
	 * @param hand
	 *            手札
	 * @return ポイント
	 */
	public int point(int point, List<Tramp> hand) {
		// List<Tramp>型のhandから0番目の情報を取得し削除。トランプのポイントを取得し変数pointに代入
		point += hand.remove(0).getTrampPoint();
		return point;
	}

	/**
	 * 引いた人と引いたカード名を表示する
	 *
	 * @author dfjkyrcq
	 * @param humanname
	 *            トランプを引いた人の名前
	 * @param drawcard
	 *            引いたカード
	 */
	public void drawMessage(String humanname, Tramp drawcard) {
		// 文字列の表示
		System.out.println(humanname + "は" + drawcard.getTrampMark() + "の" + drawcard.getTrampNumberMark() + "を引きました");
	}

	/**
	 * 引いた人と引いたカードの合計ポイントを表示する
	 *
	 * @author dfjkyrcq
	 * @param humanname
	 *            トランプを引いた人の名前
	 * @param point
	 *            合計ポイント
	 */
	public void pointShow(String humanname, String point) {
		// 文字列の表示
		System.out.println(humanname + "のポイントは" + point + "です。");
	}

	/**
	 * バーストの判定を行うメソッド
	 *
	 * @author dfjkyrcq
	 * @param point
	 *            引いたトランプの合計ポイント
	 * @param humanname
	 *            人の名前
	 */
	public void burst(int point, String humanname) {
		// pointが21を超えているなら
		if (point > 21) {
			// 点線の表示
			lineShow();
			// 文字列の表示
			System.out.println(humanname + "がバースト");
			// プログラムを終了する
			System.exit(0);
		}
	}

	/**
	 * 勝敗判定メソッド
	 *
	 * @author dfjkyrcq
	 * @param playername
	 *            プレイヤーの名前
	 * @param playerpoint
	 *            プレイヤーの合計ポイント
	 * @param dealerpoint
	 *            ディーラーの合計ポイント
	 */
	public void battleJudge(String playername, int playerpoint, int dealerpoint) {
		// プレイヤーのポイントがディーラーのポイント以上なら
		if (playerpoint >= dealerpoint) {
			// 文字列の表示
			System.out.println(playername + "の勝ち");
		} else {
			// 文字列の表示
			System.out.println(playername + "の負け");
		}

	}

	// コンソール上で見やすいように仕切りをするための点線を表示する
	public void lineShow() {
		// 点線の表示
		System.out.println("------------------------------------------------");
	}
}
