package demoset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(10);
		listInteger.add(4);
		listInteger.add(8);
		listInteger.add(2);
		Set<Integer> treeSet = new TreeSet<Integer>(listInteger);
		System.out.println("Các phần tử có trong treeSet:");
		System.out.println(treeSet);
//		Set<Integer> hashSet = new HashSet<>();
//		hashSet.add(41);
//		hashSet.add(2);
//		hashSet.add(0);
//		hashSet.add(5);
//		hashSet.add(1);
//		hashSet.add(10);
//		Set<Integer> treeSet = new TreeSet<>();
//		treeSet.add(41);
//		treeSet.add(2);
//		treeSet.add(0);
//		treeSet.add(5);
//		treeSet.add(1);
//		treeSet.add(10);
//		System.out.println("Các phần tử có trong hashSet:");
//		System.out.println(hashSet);
//		System.out.println("Các phần tử có trong treeSet:");
//		System.out.println(treeSet);
	}

}
