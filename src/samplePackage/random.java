package samplePackage;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください。"); // 数字入力
		int num = sc.nextInt();
		sc.close();

		int a = (int) (Math.random() * 10); // 0～9までの数字をランダムに生成
		if (num == a) { // 入力した数字とランダム生成された数字が一致したとき
			System.out.println("当たりです。");
		} else
			System.out.println("はずれです");
	}
}
