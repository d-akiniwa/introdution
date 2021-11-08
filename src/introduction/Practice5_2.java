package introduction;

public class Practice5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		email("おはよう", "a@gmail.com", "今日はいい天気ですね");
	}
	public static void email(String title, String address, String text) { 
		System.out.println("以下の形式で表示を行う");
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
