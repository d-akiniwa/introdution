package introduction;

public class Practice4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int number : numbers) {
			if (number == input) {
				System.out.println("アタリ！");
			}
		}
	}

}
