import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FB1 {
	/** FB1クラスを扱う */

public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
	BufferedReader br =
	new BufferedReader (new InputStreamReader (System.in));

	System.out.println("Java FizzBuzz");
		/** "Java FizzBuzz"とタイトルを出す */

	String str = br.readLine();
	int res = Integer.parseInt(str);

	for(int i = 1; i <= res; i++)
		/** i=1 ～ 入力された数値になるまで +1して繰り返す */

		if(i % 3 == 0 && i % 5 == 0){
			/** i = 3, 5両方で割って余剰0になる場合 */
		System.out.println("FizzBuzz");}
			/** "FizzBuzz"と出力 */

		else if(i % 3 == 0){
			/** i = 3で割って余剰0になる場合 */
		System.out.println("Fizz");}
			/** "Fizz"と出力 */

		else if(i % 5 == 0){
			/** i = 5で割って余剰0になる場合 */
		System.out.println("Buzz");}
			/** "Buzz"と出力 */

		else {System.out.println(i + "");}
			/** その他の数の場合は数値のみ */

	}

}