import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoUseIterator {
	public static void main(String[] args) {
		Map<Integer, String> mapLanguages = new TreeMap<>();
		mapLanguages.put(1, "CSDL");
		mapLanguages.put(0, "C++");
		mapLanguages.put(3, "C Sharp");
		mapLanguages.put(2, "PHP");
		Iterator<Map.Entry<Integer, String>> iterator = mapLanguages.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
