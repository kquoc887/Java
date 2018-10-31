package demolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoArrayListObject {
	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Student student = new Student(i, "myname" + i);
			listStudent.add(student);
		}
		for (Student element : listStudent) {
			System.out.println(element);
		}
		System.out.println("Nhập vào giá trị mới cho sinh viên muốn thay đổi:");
		System.out.println("Nhập vào vị trí của sinh viên cần thay đổi:");
		int index = sc.nextInt();
		System.out.println("Nhập vào giá trị id mới cho Student muốn thay đổi:");
		int id = sc.nextInt();
		System.out.println("Nhập vào name mới cho Student muốn thay đổi:");
		sc.nextLine();
		String nameStudent = sc.nextLine();
		Student student = new Student(id, nameStudent);
		listStudent.set(index, student);
		System.out.println("\nCác phần tử có trong listString sau khi thay đổi: ");
		for (Student element : listStudent) {
			System.out.println(element);
		}
		
		System.out.println("\nXóa Student vừa mới thay đổi:");
		listStudent.remove(student);
		System.out.println("\nDanh sách sinh viên sau khi xóa");
		for (Student element : listStudent) {
			System.out.println(element);
		}
		
	}
}
