package introduction;

import java.util.function.IntBinaryOperator;

public class Main1 {
	public static int sub1(int x, int y) {
		System.out.println("xの値：" + x);
		System.out.println("yの値：" + y);
		return x - y;
	}

	public static long sub2(int x) {
		System.out.println("xの値：" + x);
		return x * 10000000000L;
	}

	public static double sub3(int x) {
		System.out.println("xの値：" + x);
		return x;
	}

	public static void sub4(int x) {
		System.out.println("xの値：" + x);
	}

	public static int sub5() {
		System.out.println("引数無し");
		return 5;
	}

	public static void main(String[] args) {
		MyFunction func = Main1::sub1;
		System.out.println("subメソッドの戻り値：" + func.call(5, 2));
		MyFunction1 func2 = Main1::sub2;
		System.out.println("sub2メソッドの戻り値：" + func2.call(5));
		MyFunction3 func3 = Main1::sub3;
		System.out.println("sub3メソッドの戻り値：" + func3.call(5));
		MyFunction4 func4 = Main1::sub4;
		func4.call(5);
		MyFunction5 func5 = Main1::sub5;
		System.out.println("sub5メソッドの戻り値：" + func5.call());
		IntBinaryOperator func01 = (int a, int b) -> {return a - b;};
		System.out.println("ラムダ式：" + func01.applyAsInt(5, 3));
		MyFunction10 func10 = (IntBinaryOperator func11, int a, int b) -> {
			int result = func11.applyAsInt(a, b) + func11.applyAsInt(a, b);
			return result;
		};
		IntBinaryOperator func12 = (int a, int b) -> {return a * b;};
		System.out.println("ラムダ式：" + func10.call(func12, 5, 3));
	}

}
