package introduction;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp >= 0) {
			this.hp = hp;
		} else {
			this.hp = 0;
		}
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if(mp >= 0) {
			this.mp = mp;
		} else {
			this.mp = 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() >= 3) {
			this.name = name;
		} else {
			System.out.println(name + "：3文字以上で指定してください");
		}
		
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if(wand != null) {
			this.wand = wand;
		}
		this.wand.setName("はじめての杖");
	}

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
}
