package samplePackage;

/**ArrayListクラスをインポート*/
import java.util.ArrayList;
/**Listクラスをインポート*/
import java.util.List;

/**
 * プレイヤークラス
 *
 * @author dfjkyrcq
 */
public class Player {
	/** List<Tramp>型の変数playerhandにArrayListクラスのインスタンスを生成 */
	private List<Tramp> playerhand = new ArrayList<Tramp>();
	/** プレイヤーのポイントを代入する変数 */
	private int playerpoint;
	/** プレイヤーの引いたカードを代入する変数 */
	private Tramp playerdrawcard;
	/** playernameをプレイヤーで初期化 */
	private final String playername = "プレイヤー";

	/**
	 * playerhandのセッタ
	 *
	 * @author dfjkyrcq
	 * @param playerhand
	 *            プレイヤーの手札
	 */
	public void setPlayerHand(List<Tramp> playerhand) {
		this.playerhand = playerhand;
	}

	/**
	 * playerpointのセッタ
	 *
	 * @author dfjkyrcq
	 * @param playerpoint
	 *            プレイヤーの合計ポイント
	 */
	public void setPlayerPoint(int playerpoint) {
		this.playerpoint = playerpoint;
	}

	/**
	 * playerdrawcardのセッタ
	 *
	 * @author dfjkyrcq
	 * @param plyerdrawcard
	 *            プレイヤーの引いたカード
	 */
	public void setPlayerDrawCard(Tramp playerdrawcard) {
		this.playerdrawcard = playerdrawcard;
	}

	/**
	 * playerhandのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return プレイヤーの手札
	 */
	public List<Tramp> getPlayerHand() {
		return playerhand;
	}

	/**
	 * playerpointのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return プレイヤーの合計ポイント
	 */
	public int getPlayerPoint() {
		return playerpoint;
	}

	/**
	 * playerdrawcardのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return プレイヤーの引いたカード
	 */
	public Tramp getPlayerDrawCard() {
		return playerdrawcard;
	}

	/**
	 * playernameのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return プレイヤーの名前
	 */
	public String getPlayerName() {
		return playername;
	}

	/**トランプを引くか選択の為のメッセージを表示*/
	public void isDrawSelectMessage() {
		/**文字列の表示*/
		System.out.println("カードを引きますか？(はい：yを入力、いいえ：それ以外を入力)");
	}

	// public void isDrawRepeat() {
	// Scanner sc = new Scanner(System.in);
	// while (sc.next().equals("y")) {
	// setPlayerDrawCard(isDraw(playerdrawcard, playerhand));
	// setPlayerPoint(isPoint(playerpoint, playerhand));
	// drawMessage(playername, playerdrawcard);
	// pointMessage(playername, playerpoint);
	// isBurst(playerpoint,playername);
	// lineShow();
	// isDrawSelectMessage();
	// }
	// sc.close();
	// }

}
