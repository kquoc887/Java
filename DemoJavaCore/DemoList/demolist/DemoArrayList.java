package demolist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoArrayList {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		Scanner scanner = new Scanner(System.in);
		//Sử dụng vòng lập thông thường.
			System.out.println("Hiển thị các phần tử sử dụng vòng lập for thông thường:");
			for (int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}

		//Sử dụng vòng lặp cải tiến duyệt theo đối tượng trong danh sách.
		System.out.println("\nHiển thị các phần tử sử dụng vòng lập for cải tiến:");
		for (String element : listString) {
			System.out.println(element);
		}
		System.out.println("\nHiển thị các phần tử sử dụng Iterator:");
		//Sử dụng Iterator: được sử dụng cho cả List, Set, Map.
		Iterator<String> iterator = listString.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Sử dụng ListIterator chỉ áp dụng đối List (List Interface, ArrayList, LinkedList ...).
		ListIterator<String> listIterator = listString.listIterator();
		System.out.println("\nHiển thị các phần tử sử dụng ListIterator:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("\nHiển thị các phần tử của List theo thứ tự từ dưới lên:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		//Thay đổi phần tử bất ký trong List.
		System.out.println("\nNhập vào phần tử mới:");
		String element = scanner.nextLine();
		System.out.println("\nNhập vào vị trí của phần tử cần thay đồi:");
		int index = scanner.nextInt();
		listString.set(index, element);
		System.out.println("Các phần tử có trong list sau khi thay đổi:");
		for (String ele : listString) {
			System.out.println(ele);
		}

		//Xóa phần tử vừa thay đổi trong danh sách
		listString.remove(index);
		System.out.println("\nCác phần tử có trong list sau khi xóa:");
		for (String ele : listString) {
			System.out.println(ele);
		}
	}

}
