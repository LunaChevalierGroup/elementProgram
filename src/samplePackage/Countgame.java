package samplePackage;

import java.util.Random;
import java.util.Scanner;

public class Countgame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int num = random.nextInt(10);
		System.out.println("入力してください");
		System.out.print("入力値：");
		int innum = sc.nextInt();
		while (num != innum) {
			if (num < innum) {
				System.out.println("はずれ、より小さな数字です。もう一度入力してください");
				System.out.print("入力値：");
				innum = sc.nextInt();
			} else if (num > innum) {
				System.out.println("はずれ、より大きな数字です。もう一度入力してください");
				System.out.print("入力値：");
				innum = sc.nextInt();
			}
		}
		System.out.println("あたり");
	}

}
