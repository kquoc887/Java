package demoset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> students = new TreeSet<>(new StudentComaparator());
		Student student1 = new Student(1, "myname3");
		Student student2 = new Student(2, "myname4");
		Student student3 = new Student(3, "myname1");
		Student student4 = new Student(4, "myname2");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		for (Student element : students) {
			System.out.println(element);
		}
	}

}
