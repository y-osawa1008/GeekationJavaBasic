package objectExercise;

//サブクラス
public class Land extends Property {
	private double area;
	
	Land(String name, String owner, String type, int price, double area) {
		super(name, owner, "土地", price);
		this.area = area;
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.println("広さ:" + area + "㎡");
		
	}

}
