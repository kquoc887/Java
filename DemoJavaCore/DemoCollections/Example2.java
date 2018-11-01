import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(46);
		list.add(24);
		list.add(64);
		list.add(10);
		list.add(5);
		System.out.println("Phần tử lớn nhất:" + Collections.max(list));
		System.out.println("Phần tử nhỏ nhất nhất:" + Collections.min(list));
		System.out.println("Chỉ số của phần tử 24:" + Collections.binarySearch(list, 64));
		Collections.sort(list);
		System.out.println("Sorted ASC:" + list);
		Collections.reverse(list);
		System.out.println("Sorted DSC:" + list);
		Comparator<Integer> comparatorDSC = Collections.reverseOrder();
		Collections.sort(list, comparatorDSC);
		System.out.println("Sorted DSC:" + list);
		Comparator<Integer> comparatorASC = Collections.reverseOrder(comparatorDSC);
		Collections.sort(list, comparatorASC);
		System.out.println("Sorted ASC:" + list);
		
	}

}
