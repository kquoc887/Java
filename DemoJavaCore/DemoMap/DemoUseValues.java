import java.util.Map;
import java.util.TreeMap;

public class DemoUseValues {
	public static void main(String[] args) {
		Map<Integer, String> mapLanguages = new TreeMap<>();
		mapLanguages.put(1, "CSDL");
		mapLanguages.put(0, "C++");
		mapLanguages.put(3, "C Sharp");
		mapLanguages.put(2, "PHP");
		for (String value : mapLanguages.values()) {
			System.out.println("Value = " + value);
		}
	}
}
