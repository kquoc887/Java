import java.util.Map;
import java.util.TreeMap;

public class DemoUseKeySet {
	public static void main(String[] args) {
		Map<Integer, String> mapLanguages = new TreeMap<>();
		mapLanguages.put(1, "CSDL");
		mapLanguages.put(0, "C++");
		mapLanguages.put(3, "C Sharp");
		mapLanguages.put(2, "PHP");
		for (Integer key : mapLanguages.keySet()) {
			System.out.println("Key = " + key);
		}
	}
}
