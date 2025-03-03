package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;
		
		boolean isGreaterA = (a > b);
		System.out.println(isGreaterA);
		
		//晴れを1
		boolean isSunny = (true);
		boolean isWarm = (true);
		
		boolean result = (isSunny && isWarm);
		System.out.println(result);
		
		int x = 0;
		int y = 8;
		System.out.println(x >= 0 && y == 8);
		
		boolean hasPermission = !(false);
		System.out.println(hasPermission);
		
		
	}

}
