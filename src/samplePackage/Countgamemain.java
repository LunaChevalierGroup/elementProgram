package samplePackage;

import java.util.Random;
import java.util.Scanner;

public class Countgamemain {

	public static void main(String[] args) {
		try {
			Countgame countgame = new Countgame();
			countgame.random();
			countgame.message("入力してください");
			while (countgame.ranum != countgame.innum) {
				if (countgame.ranum < countgame.innum) {
					countgame.message("はずれ、より小さな数です。もう一度入力してください");
				} else if (countgame.ranum > countgame.innum) {
					countgame.message("はずれ、より大きな数です。もう一度入力してください");
				}
			}
			System.out.println("あたり");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}

class Countgame {
	int ranum;
	int innum;
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	void random() {
		ranum = random.nextInt(10);
	}

	void message(String msg) {
		System.out.println(msg);
		System.out.print("入力値：");
		innum = sc.nextInt();
	}
}
