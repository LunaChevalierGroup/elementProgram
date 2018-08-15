package samplePackage;

/**Scannerクラスのインポート*/
import java.util.Scanner;

/**
 * ブラックジャックを実行するクラス
 *
 * @author dfjkyrcq
 */
public class BlackJackMain {

	public static void main(String[] args) {
		/** ブラックジャッククラスのインスタンスを生成 */
		BlackJack blackjack = new BlackJack();
		/** プレイヤークラスのインスタンスを生成 */
		Player player = new Player();
		/** ディーラークラスのインスタンスを生成 */
		Dealer dealer = new Dealer();

		/** プレイヤーのポイントを0で初期化 */
		player.setPlayerPoint(0);
		/** ディーラーのポイントを0で初期化 */
		dealer.setDealerPoint(0);

		/** トランプの束を作成 */
		blackjack.trampBundleCreate();
		/** トランプをシャッフルする */
		blackjack.trampShuffle();

		/** iを1で初期化しiをインクリメントしながらiが2以下の間初期化 */
		for (int i = 1; i <= 2; i++) {
			/** isDrawメソッドを実行し、戻り値をplayerdrawcardにセットする。 */
			player.setPlayerDrawCard(blackjack.isDraw(player.getPlayerDrawCard(), player.getPlayerHand()));
			/** isPointメソッドを実行し、戻り値をplayerpointにセットする。 */
			player.setPlayerPoint(blackjack.isPoint(player.getPlayerPoint(), player.getPlayerHand()));
			/** プレイヤーが引いたカードのメッセージを表示する */
			blackjack.drawMessage(player.getPlayerName(), player.getPlayerDrawCard());
			/** プレイヤーが引いたカードの合計ポイントのメッセージを表示する */
			blackjack.pointMessage(player.getPlayerName(), player.getPlayerPoint());
			/** 点線を表示 */
			blackjack.lineShow();
		}

		/** isDrawメソッドを実行し、戻り値をdealerdrawcardにセットする。 */
		dealer.setDealerDrawCard(blackjack.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
		/** isPointメソッドを実行し、戻り値をdealerpointにセットする。 */
		dealer.setDealerPoint(blackjack.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
		/** ディーラーが引いたカードのメッセージを表示する */
		blackjack.drawMessage(dealer.getDealerName(), dealer.getDealerDrawCard());
		/** ディーラーが引いたカードの合計ポイントのメッセージを表示する */
		blackjack.pointMessage(dealer.getDealerName(), dealer.getDealerPoint());
		/** 点線を表示 */
		blackjack.lineShow();

		/** isDrawメソッドを実行し、戻り値をdealerdrawcardにセットする。 */
		dealer.setDealerDrawCard(blackjack.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
		/** isPointメソッドを実行し、戻り値をdealerpointにセットする。 */
		dealer.setDealerPoint(blackjack.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
		/** ディーラーが引いた2枚目のカードが非表示である旨を表示 */
		dealer.dealerSecondMessage();
		/** 点線を表示 */
		blackjack.lineShow();

		/** カードを引くかの選択するためのメッセージを表示 */
		player.isDrawSelectMessage();
		/** Scannerクラスのインスタンスを生成 */
		Scanner sc = new Scanner(System.in);
		/** 入力された文字列がｙである間繰り返す */
		while (sc.next().equals("y")) {
			/** isDrawメソッドを実行し、戻り値をplayerdrawcardにセットする。 */
			player.setPlayerDrawCard(blackjack.isDraw(player.getPlayerDrawCard(), player.getPlayerHand()));
			/** isPointメソッドを実行し、戻り値をplayerpointにセットする。 */
			player.setPlayerPoint(blackjack.isPoint(player.getPlayerPoint(), player.getPlayerHand()));
			/** プレイヤーが引いたカードのメッセージを表示する */
			blackjack.drawMessage(player.getPlayerName(), player.getPlayerDrawCard());
			/** プレイヤーが引いたカードの合計ポイントのメッセージを表示する */
			blackjack.pointMessage(player.getPlayerName(), player.getPlayerPoint());
			/** プレイヤーのポイントがバーストしていないか判定 */
			blackjack.isBurst(player.getPlayerPoint(), player.getPlayerName());
			/** 点線を表示 */
			blackjack.lineShow();
			/** カードを引くかの選択するためのメッセージを表示 */
			player.isDrawSelectMessage();
		}
		/** Scannerクラスを閉じる */
		sc.close();
		// dealer.isDrawRepeat();

		/** ディーラーの合計ポイントが17より小さい間繰り返す */
		while (dealer.getDealerPoint() < 17) {
			/** 点線を表示 */
			blackjack.lineShow();
			/** isDrawメソッドを実行し、戻り値をdealerdrawcardにセットする。 */
			dealer.setDealerDrawCard(blackjack.isDraw(dealer.getDealerDrawCard(), dealer.getDealerHand()));
			/** isPointメソッドを実行し、戻り値をdealerpointにセットする。 */
			dealer.setDealerPoint(blackjack.isPoint(dealer.getDealerPoint(), dealer.getDealerHand()));
			/** プレイヤーが引いたカードのメッセージを表示する */
			blackjack.drawMessage(dealer.getDealerName(), dealer.getDealerDrawCard());
			/** プレイヤーが引いたカードの合計ポイントのメッセージを表示する */
			blackjack.pointMessage(dealer.getDealerName(), dealer.getDealerPoint());

		}
		// dealer.dealerDraw();
		/** ディーラーのポイントがバーストしていないか判定 */
		blackjack.isBurst(dealer.getDealerPoint(), dealer.getDealerName());

		/** ディーラーとプレイヤーのポイントを表示 */
		blackjack.pointShow(player.getPlayerPoint(), dealer.getDealerPoint());
		/** 勝敗を判定する */
		blackjack.battleJudge(player.getPlayerPoint(), dealer.getDealerPoint());

	}

}
