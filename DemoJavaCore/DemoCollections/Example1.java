import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		System.out.println("Các phần tử trong list1:");
		System.out.println(list1);
		String[] strArr = {"Five","Six"};
		Collections.addAll(list1, strArr);
		System.out.println("Các phần tử trong list1 lúc sau:");
		System.out.println(list1);
		
	}
}
