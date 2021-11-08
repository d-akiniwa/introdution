package introduction;

public class Practice17_1 {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("「NullPointerException例外をcatchしました」");
			System.out.println("「ーースタックトレース（ここから）ーー」");
			e.printStackTrace();
			System.out.println("「ーースタックトレース（ここまで）ーー」");
		}
		
	}

}