import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoEntrySet {
	public static void main(String[] args) {
		Map<Integer, String> mapLanguages = new TreeMap<>();
		mapLanguages.put(1, "CSDL");
		mapLanguages.put(0, "C++");
		mapLanguages.put(3, "C Sharp");
		mapLanguages.put(2, "PHP");
		
		Set<Map.Entry<Integer, String>> setLanguages = mapLanguages.entrySet();
		System.out.println("Các entry có trong setLanguages:");
		System.out.println(setLanguages);
	}
}
