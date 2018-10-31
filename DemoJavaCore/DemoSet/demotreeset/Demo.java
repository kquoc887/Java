package demotreeset;

import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> treeSet = new TreeSet<Student>();
		Student student1 = new Student(1, "myname2");
		Student student2 = new Student(2, "myname4");
		Student student3 = new Student(3, "myname5");
		Student student4 = new Student(4, "myname3");
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		for (Student element : treeSet) {
			System.out.println(element);
		}
		
		
	}

}
