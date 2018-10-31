import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
	public static void main(String[] args) {
		Map<Integer, String> hasmap = new HashMap<>();
		hasmap.put(1, "One");
		hasmap.put(0, "Zero");
		hasmap.put(2, "Two");
		hasmap.put(3, "Tree");
		hasmap.forEach((keyInt, valueString)-> System.out.println("Key = " + keyInt + ", Value = " + valueString ));
	}
}
