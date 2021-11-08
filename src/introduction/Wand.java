package introduction;

public class Wand {
	private String name;
	private double power;

	public void setName(String name) {
		if(name.length() >= 3) {
			this.name = name;
		} else {
			System.out.println(name + "：3文字以上で指定してください");
		}
	}

	public String getName() {
		return this.name;
	}

	public void setPower(double power) {
		if(power >= 0.5 && power <= 100) {
			this.power = power;
		} else {
			System.out.println(power + "は増幅率の範囲外です");
		}
	}

	public double getPower() {
		return this.power;
	}
}
