package introduction;

public class Practice5_3 {

	public static void main(String[] args) {
		
		email("a@gmail.com", "今日はいい天気ですね");
	}
	public static void email(String title, String address, String text) { 
		System.out.println("以下の形式で表示を行う");
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	public static void email(String address, String text) { 
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

}
