package samplePackage;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
int i;
Scanner sc = new Scanner(System.in);
System.out.println("数字を入力してください。");
int num = sc.nextInt();
sc.close();
for(i = 0; i <= num; i ++);
if( i % 3 == 0 && i % 5 == 0  )
System.out.println("FizzBuzz");
else if( i % 3 == 0)
		System.out.println("Fizz");
		else if ( i % 5 == 0)
System.out.println("Buzz");
		else
			System.out.println(i);













}







	}




