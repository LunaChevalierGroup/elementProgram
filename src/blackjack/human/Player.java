package blackjack.human;

import java.util.ArrayList;
import java.util.List;

import blackjack.trump.Card;
import blackjack.trump.Deck;

/**
 * プレイヤー抽象クラス
 * @author LunaC
 *
 */
public abstract class Player {
	// 手札
	private List<Card> hand = new ArrayList<Card>();
	private String name;

	public List<Card> getHand(){
		return hand;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	/**
	 * 手札にカードを加える
	 * @author LunaC
	 * @param card 手札に加えるカード
	 *
	 */
	private void addHand(Card card){
		hand.add(card);
	}

	/**
	 * プレイヤーが1ターンにするメソッド
	 * @author LunaC
	 * @param deck ゲームで使用しているデッキ
	 *
	 */
	public void turn(Deck deck){
		if(isDraw()){
			Card card = deck.getDeck().remove(0);
			draw(card);
			System.out.println(getNoticeDrawCard(card));
			System.out.println(getNoticePoint());
			if(!isLose()){
				turn(deck);
			}
		}
	}

	/**
	 * プレイヤーがドローするか判定する抽象メソッド
	 * @author LunaC
	 * @return ドローする条件を満たしていればtrue それ以外はfalse
	 *
	 */
	public abstract boolean isDraw();

	/**
	 * プレイヤーの手札からポイントを取得する
	 * @author LunaC
	 * @return ポイント
	 *
	 */
	public int getPoint(){
		int point = 0;
		for(int i = 0; i < hand.size(); i++){
			point = point + hand.get(i).getNumber().getPoint();
		}
		return point;
	}

	/**
	 * カードをドローする
	 * @author LunaC
	 * @param card 引くカード
	 *
	 */
	public void draw(Card card){
		addHand(card);
	}

	/**
	 * プレイヤーが敗北したか判定する
	 * @author LunaC
	 * @return 敗北していたらtrue それ以外はfalse
	 *
	 */
	public boolean isLose(){
		return isBurst();
	}

	/**
	 * プレイヤーがバーストした(ポイントの合計が21を超えた)か判定する
	 * @author LunaC
	 * @return バーストしていたらtrue それ以外はfalse
	 *
	 */
	private boolean isBurst(){
		return getPoint() > 21;
	}

	/**
	 * プレイヤーが引いたカードを出力用に取得する
	 * @author LunaC
	 * @return 出力用のプレイヤーが引いたカード
	 *
	 */
	public String getNoticeDrawCard(Card card){
		return getName() + "は" + card.getPrintCard() + "を引きました";
	}

	/**
	 * プレイヤーのポイントを出力用に取得する
	 * @author LunaC
	 * @return 出力用のプレイヤーポイント
	 *
	 */
	public String getNoticePoint(){
		return "只今の" + getName() + "のポイントは" + getPoint() + "です";
	}
}
