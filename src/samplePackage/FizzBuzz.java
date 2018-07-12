package samplePackage;

import java.util.Scanner;  //Scannerで文字を入力するために記述

public class FizzBuzz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください。"); //数字入力
		int num = sc.nextInt();
		sc.close();

		int i;
		for (i = 0; i <= num; i++) {

		if (i % 3 == 0 && i % 5 == 0)     //3と5両方で割れるとき
			System.out.println("FizzBuzz");
		else if (i % 3 == 0)   //3で割れるとき
			System.out.println("Fizz");
		else if (i % 5 == 0)   //5で割れるとき
			System.out.println("Buzz");
		else
			System.out.println(i);

		}



}
}