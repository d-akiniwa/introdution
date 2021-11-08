package introduction;

import java.util.ArrayList;
import java.util.List;

 class Hero1 {
	public String name;
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(o instanceof Hero1) {
			Hero1 h = (Hero1)o;
			if(this.name == h.name) {
				return true;
			}
		}
		return false;
	}
}

public class Sample2_4_3 {

	public static void main(String[] args) {
		List<Hero1> list = new ArrayList<>();
		Hero1 h1 = new Hero1();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数：" + list.size());
		System.out.println(list.get(0).name);
		h1 = new Hero1();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数：" + list.size());
	}

}
