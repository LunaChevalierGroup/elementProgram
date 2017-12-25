// Personクラス
// ここでPersonという概念を作る
// あくまでも概念の為，この時点ではまだいない
public class Person {
	// 身長のフィールド
	private int height;
	// 体重のフィールド
	private int weight;
	// 誕生日のフィールド
	private int birthday;

	// コンストラクタ
	// 引数が無いと，身長160，体重60でインスタンスが生成される
	public Person() {
		setHeight(160);
		setWeight(60);
		this.birthday = 20171225;
	}

	// コンストラクタ
	// 引数が2つあると，第1引数を身長，第2引数を体重としてインスタンスが生成される
	public Person(int height, int weight, int birthday) {
		setHeight(height);
		setWeight(weight);
		this.birthday = (birthday);
	}

	// 身長のゲッター
	// heightの中身を見るためのメソッド
	// 他のクラスからheightの値を取り出すとき必須
	// 体重，誕生日も同じ
	public int getHeight() {
		return this.height;
	}

	// 身長のセッター
	// heightに代入するためのメソッド
	// 他のクラスからheightに代入するとき必須
	// 体重も同じ
	public void setHeight(int height) {
		this.height = height;
	}

	// 体重のゲッター
	public int getWeight() {
		return this.weight;
	}

	// 体重のセッター
	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 誕生日のゲッター
	public int getBirthday() {
		return this.birthday;
	}
}
