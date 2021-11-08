package introduction;

import java.util.function.IntPredicate;

public class Practice2_6_1 {
	public static boolean isOdd(int x) {
		return (x % 2 == 1);
	}

	public String addNamePrefix(boolean male, String name) {
		if (male == true) {
			return "Mr." + name;
		} else {
			return "Ms." + name;
		}
	}

	public static void main(String[] args) {
		IntPredicate ip = Practice2_6_1::isOdd;
		System.out.println("戻り値：" + ip.test(5));
		Practice2_6_1 p = new Practice2_6_1();
		MyFunction20 func20 = p::addNamePrefix;
		System.out.println("戻り値：" + func20.call(true, "Mike"));
	}

}
