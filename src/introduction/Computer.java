package introduction;

public class Computer extends TangibleAsset {
	String makerName;

	public Computer(String name, int price, String color, String makerName, double weight) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getMakerName() {
		return this.makerName;
	};
}
