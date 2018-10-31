import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemoAddDataInMap {
	public static void main(String[] args) {
		Map<String, String> mapStudents = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String maSV;
		String nameSV;
		int soSV;
		System.out.println("Nhập vào số sinh viên cần thêm:");
		soSV = sc.nextInt();
		sc.nextLine();
		for (int i = 1 ; i <= soSV; i++) {
			System.out.println("Nhập thông tin của sinh viên thứ " + i);
			System.out.println("Nhập MSSV: ");
			maSV = sc.nextLine();
			System.out.println("Nhập tên SV: ");
			nameSV = sc .nextLine();
			mapStudents.put(maSV, nameSV);
		}
		Iterator<Map.Entry<String, String>> iterator = mapStudents.entrySet().iterator();
		System.out.println("Số sinh viên có trong Map:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Thêm 1 sinh viên mới vào trong Map
		System.out.println("Nhập mã SV cần thêm:");
		String maSVNew = sc.nextLine();
		System.out.println("Nhập tên SV cần thêm:");
		String nameSVNew = sc.nextLine();
		if (mapStudents.containsKey(maSVNew)) {
			System.out.println("Mã SV = " + maSVNew + " đã tồn tại");
		} else {
			mapStudents.put(maSVNew, nameSVNew);
			soSV++;
			System.out.println("Danh sách Sinh Viên sau khi thêm");
			System.out.println("Số sinh viên = " + soSV);
			System.out.println("Mã SV \tTên SV");
			iterator = mapStudents.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry = iterator.next();
				System.out.println(entry.getKey() +"\t" + entry.getValue());
			}
			
		}
		
	}
}
