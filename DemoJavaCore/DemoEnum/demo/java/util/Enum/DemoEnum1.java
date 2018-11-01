package demo.java.util.Enum;
enum Season{
	SPRING, SUMMER, FALL, WINNER;
}
public class DemoEnum1 {
	public static void main(String[] args) {
//		Season season = Season.SUMMER;
//		System.out.println(season);
		
		for (Season element : Season.values()) {
			System.out.println(element);
		}
		
	}
}
