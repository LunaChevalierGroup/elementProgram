package blackjack.human;

import blackjack.trump.Card;

/**
 * ディーラークラス
 * @author LunaC
 *
 */
public class Dealer extends Player {
	public Dealer() {
		setName("ディーラー");
	}

	/**
	 * ディーラーがドローするか判定する
	 * ドロー判定基準は，ポイントが17未満なら引く
	 * @author LunaC
	 * @return ドローする条件を満たしていればtrue それ以外はfalse
	 *
	 */
	public boolean isDraw(){
		return getPoint() < 17;
	}

	/**
	 * ディーラーが引いた2枚目のカードを取得する
	 * @author LunaC
	 * @return ディーラーの2枚目の手札
	 *
	 */
	public Card getSecondDrawCard(){
		return getHand().get(1);
	}
}
