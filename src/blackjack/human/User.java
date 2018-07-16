package blackjack.human;

import java.util.Scanner;

/**
 * ユーザークラス
 * @author LunaC
 *
 */
public class User extends Player {
	public User(){
		setName("あなた");
	}

	/**
	 * ユーザーがドローするか判定する
	 * ドロー判定基準は，入力でyまたはYを入力しているか
	 * @author LunaC
	 * @return ドローする条件を満たしていればtrue それ以外はfalse
	 *
	 */
	public boolean isDraw(){
		System.out.println("カードを引く場合はY，引かない場合はそれ以外を入力してください");
		String input = new Scanner(System.in).nextLine();
		return input.equals("Y") || input.equals("y");
	}
}
