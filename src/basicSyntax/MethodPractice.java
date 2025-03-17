package basicSyntax;

public class MethodPractice {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 100;
		int b = 50;
		
		// 各計算結果を出力
        printResult(add(a, b));
        printResult(subtract(a, b));
        printResult(multiply(a, b));
        printResult(divide(a, b));
		
	}

	//メソッド1 二つの値を足し算するメソッド
	//addまたはaddup:英語で「加える、足す」を意味し、足し算を行うメソッドにふさわしい名前。
	public static int add(int a,int b) {
		return a + b;
	}
	//メソッド2 二つの値を引き算するメソッド
	//subtract:英語で「引く、減算する」を意味し、引き算を行うメソッド。
	public static int subtract(int a, int b) {
        return a - b;
    }
	//メソッド3 二つの値を掛け算するメソッド
	//multiply:英語で「掛ける」を意味し、掛け算の機能を持つメソッド。
	public static int multiply(int a, int b) {
        return a * b;
    }
	//メソッド4 二つの値を割り算するメソッド
	//divide：英語で「割る」を意味し、割り算の処理をするメソッド。
	public static int divide(int a, int b) {
        return a / b;
    }
	//メソッド5 コンソールに出力するためのメソッド
	public static void printResult(int result) {
        System.out.println("計算結果は" + result + "です。");
    }

}
