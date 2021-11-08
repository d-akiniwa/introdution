package introduction;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した！");
	}

	public int pray(int mp) {
		System.out.println(this.name + "は" + mp + "秒間天に祈った！");
		int random = new java.util.Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp, (mp + random));

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}