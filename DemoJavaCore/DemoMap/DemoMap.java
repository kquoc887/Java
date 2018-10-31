import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "One");
		hashmap.put(0, "Zero");
		hashmap.put(3, "Three");
		hashmap.put(6, "Six");
		hashmap.put(5, "Five");
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "One");
		linkedHashMap.put(0, "Zero");
		linkedHashMap.put(3, "Three");
		linkedHashMap.put(6, "Six");
		linkedHashMap.put(5, "Five");

		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "One");
		treeMap.put(0, "Zero");
		treeMap.put(3, "Three");
		treeMap.put(6, "Six");
		treeMap.put(5, "Five");
		System.out.println("Các phần tử có trong hashmap:");
		System.out.println(hashmap);
		System.out.println("Các phần tử có trong linkedHashMap:");
		System.out.println(linkedHashMap);
		System.out.println("Các phần tử có trong TreeMap:");
		System.out.println(treeMap);
	}
}
