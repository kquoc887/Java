package demolist;

import java.util.LinkedList;
import java.util.List;

public class DemoListObject {
	public static void main(String[] args) {
		List<Student> listStudent = new LinkedList<Student>();
		for (int i = 0; i < 3; i++) {
			Student student = new Student(i, "name" + i);
			listStudent.add(student);
		}
		for (Student element : listStudent) {
			System.out.println(element);
		}
	}
}
