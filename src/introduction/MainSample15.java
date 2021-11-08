package introduction;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class MainSample15 {

	public static void main(String[] args) throws Exception {
		System.out.println("//15-1：文字列を調査する");
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		} else {
			System.out.println("s2とs3は等しくありません");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		s1 = "";
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
		System.out.println();
		System.out.println("//15-2：文字列を検索する");
		s1 = "Java and JavaScript";
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		System.out.println();
		System.out.println("//15-3：文字列を切り出す");
		s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));
		
		//15-3：文字列の連結
		StringBuilder sb  = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append("J ");
		}
		System.out.println(sb);
		
		MainSample15 mainSample15 = new MainSample15();
		System.out.println(mainSample15.isValidPlayerName("CHARTOST"));
		
		//15-4：正規表現の活用
		System.out.println("➀通常の文字：その文字でなければならない");
		String s = "Java";
		System.out.println(s.matches("Java"));
		System.out.println(s.matches("JavaJava"));
		System.out.println(s.matches("java"));
		System.out.println("➁ピリオド：任意の1文字であればよい");
		System.out.println(s.matches("J.va"));
		System.out.println("➂アスタリスク：直前の文字の0回以上の繰り返し");
		System.out.println("Jaaaaava".matches("Ja*va"));
		System.out.println("あいうxx019".matches(".*"));
		s = "Math";
		System.out.println(s.matches("Ma.*"));
		s = "abcdefghiful";
		System.out.println(s.matches(".*ful"));
		System.out.println("➃波カッコ：指定回数の繰り返し");
		s = "HELLO";
		System.out.println(s.matches("HEL{2}O"));
		System.out.println("➄各カッコ：いずれかの文字");
		s = "URL";
		System.out.println(s.matches("UR[LIN]"));
		System.out.println("⑥各カッコ内のハイフン：指定範囲のいずれかの文字");
		System.out.println("url".matches("[a-z]{3}"));
		System.out.println(s.matches("[a-z]{3}"));
		//15-4-3：正規表現を用いたほかの処理
		s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w : words) {
			System.out.print(w + " -> ");
		}
		System.out.println("");
		s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
		sb = new StringBuilder();
		sb = sb.append("hello ").append("java ").append("world");
		System.out.println(sb);
		System.out.println("15-5：文字列の書式整形");
		String FORMAT = "%-9s %-13s 所持金%,6d円";
		s = String.format(FORMAT, "ミナト", "友達", 30000);
		System.out.println(s);
		System.out.println("15-6：日付と時刻を扱う");
		long start = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb1.append("j");
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は：" + (end - start) + "ミリ秒でした");
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
		Calendar c = Calendar.getInstance();
		c.set(2019, 8, 22, 1, 23, 45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d1 = f.parse("2020/09/22 01:23:45");
		System.out.println(d1);
		s = f.format(now);
		System.out.println("現在は" + s + "です");
		Instant it = Instant.now();
		System.out.println(it);
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		System.out.println(i2);
		long I = i2.toEpochMilli();
		System.out.println(I);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println(z1);
		System.out.println(z2);
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println(z3);
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		System.out.println(l1);
		System.out.println(l2);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate Idate = LocalDate.parse("2020/09/22", fmt);
		System.out.println(Idate);
		
		//1000日後を計算する
		LocalDate Idatep = Idate.plusDays(1000);
		System.out.println("1000日後は" + Idatep);
		LocalDate now1 = LocalDate.now();
		//現在日時との比較
		if(now1.isAfter(Idatep)) {
			System.out.println("1000日後は過去日付です");
		}
		LocalDate d10 = LocalDate.of(2020, 1, 1);
		LocalDate d20 = LocalDate.of(2020, 1, 4);
		System.out.println(d10);
		System.out.println(d20);
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d10, d20);
//		System.out.println(Period.ofDays(Period.between(d10, d20)));
		System.out.println(p1);
		System.out.println(p2);
		LocalDate d3 = d20.plus(p2);
		System.out.println(d3);
	}
//	public boolean isValidPlayerName(String name) {
//		if(name.length() != 8) {
//			return false;
//		}
//		char first = name.charAt(0);
//		if(!(first >= 'A' && first <= 'Z')) {
//			return false;
//		}
//		for(int i = 1; i < 0; i++) {
//			char c = name.charAt(i);
//			if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
//				return false;
//			}
//		}
//		char n = 'c';
//		if(n >= 'A') {
//			System.out.println(n);
//		}
//		System.out.println(name);
//		return true;
//	}
	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
