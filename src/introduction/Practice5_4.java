package introduction;

public class Practice5_4 {

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		System.out.println("三角形の底辺の長さが" + bottom + "cm、" + "高さが" + height + "cmの場合、面積は" + calcTriangleArea(bottom, height) + "㎠");
		double radius = 5.0;
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + calcCircleArea(radius) + "㎠");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
