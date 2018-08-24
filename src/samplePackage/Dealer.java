package samplePackage;

//ArrayListクラスのインポート
import java.util.ArrayList;
//Listクラスのインポート
import java.util.List;

/**
 * ディーラークラス
 *
 * @author dfjkyrcq
 */
public class Dealer {
	// List<Tramp>型の変数dealerhandにArrayList<Tramp>クラスのインスタンスを生成
	private List<Tramp> dealerhand = new ArrayList<Tramp>();
	// ディーラーのポイントを代入する変数
	private int dealerpoint;
	// ディーラーの引いたカードを代入する変数
	private Tramp dealerdrawcard;
	// dealernameをDealerで初期化
	private final String dealername = "Dealer";
	// dealerhiddenをHiddenで初期化
	private final String dealerhidden = "Hidden";

	/**
	 * dealerhandのセッタ
	 *
	 * @author dfjkyrcq
	 * @param dealerhand
	 *            ディーラーの手札
	 */
	public void setDealerHand(List<Tramp> dealerhand) {
		this.dealerhand = dealerhand;
	}

	/**
	 * dealerpointのセッタ
	 *
	 * @author dfjkyrcq
	 * @param dealerpoint
	 *            ディーラーの合計ポイント
	 */
	public void setDealerPoint(int dealerpoint) {
		this.dealerpoint = dealerpoint;
	}

	/**
	 * dealerdrawcardのセッタ
	 *
	 * @author dfjkyrcq
	 * @param dealerdrawcard
	 *            ディーラーの引いたカード
	 */
	public void setDealerDrawCard(Tramp dealerdrawcard) {
		this.dealerdrawcard = dealerdrawcard;
	}

	/**
	 * dealerhandのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return ディーラーの手札
	 */
	public List<Tramp> getDealerHand() {
		return dealerhand;
	}

	/**
	 * dealerpointのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return ディーラーの合計ポイント
	 */
	public int getDealerPoint() {
		return dealerpoint;
	}

	/**
	 * dealerdrawcardのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return ディーラーの引いたカード
	 */
	public Tramp getDealerDrawCard() {
		return dealerdrawcard;
	}

	/**
	 * dealernameのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return ディーラーの名前
	 */
	public String getDealerName() {
		return dealername;
	}

	/**
	 * dealerhiddenのゲッタ
	 *
	 * @author dfjkyrcq
	 * @return Hidden
	 */
	public String getDealerHidden() {
		return dealerhidden;
	}

	/**
	 * ディーラーが2枚目のカードを引いた時に表示する文字列
	 *
	 * @author dfjkyrcq
	 */
	public void dealerSecondMessage() {
		// 文字列を表示
		System.out.println("2枚目" + dealername + "が引いたカードは非表示です。");
	}

}
