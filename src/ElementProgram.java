public class ElementProgram{
	public static void main(String[] args) {
		// person1という人を作る(インスタンス生成)
		// Personに引数が無いため，予め決められた値が身長，体重，誕生日それぞれに入る
		Person person1 = new Person();
		System.out.println(person1.getHeight());
		System.out.println(person1.getWeight());
		System.out.println(person1.getBirthday());
		System.out.println("----------------------");

		// person2という人を作る
		// Personに引数があるため，それらの値が身長，体重，誕生日それぞれに入る
		Person person2 = new Person(180, 65, 19920817);
		System.out.println(person2.getHeight());
		System.out.println(person2.getWeight());
		System.out.println(person2.getBirthday());
		System.out.println("----------------------");

		// person1とperson2は実際に存在するため，身長や体重が変化したらその更新が可能
		// person1の身長を160→170に変更
		person1.setHeight(170);
		System.out.println(person1.getHeight());
		System.out.println(person1.getWeight());
		System.out.println(person1.getBirthday());
		System.out.println("----------------------");
		// person2の体重を165→87に変更
		person2.setWeight(87);
		System.out.println(person2.getHeight());
		System.out.println(person2.getWeight());
		System.out.println(person2.getBirthday());
		System.out.println("----------------------");

		// 誕生日は更新できない様にする為，誕生日のセッターは定義していない
	}
}