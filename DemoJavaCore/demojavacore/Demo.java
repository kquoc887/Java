import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	//Sử dụng vòng lặp for cải tiến duyệt theo đối tượng trong danh sách.
	public static void main(String[] args) {
		List<String> listString = new LinkedList<String>();
		Iterator<String> iterator = null;
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		System.out.println("Danh sách các phần tử:");
		iterator = listString.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
