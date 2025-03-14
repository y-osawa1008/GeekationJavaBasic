package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.println("FizzBuzz"); //優先順位を考える。先に3と5で割り切れる15,30,45...が「FizzBuzz」になるように優先する
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		String[] js = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		for (String j : js) {
			//Javaの場合
			if (j.equals("Java")) { //文字列比較にはequals()を使う
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}
			//HTMLの場合
			if (j.equals("HTML")) {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}
			System.out.println(j);
		}
	}

}
