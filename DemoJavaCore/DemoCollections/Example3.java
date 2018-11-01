import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example3 {
	public static void print(List<Student> students) {
		for (Student st : students) {
			System.out.println(st);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student(1, "myname1", 15);
        Student student2 = new Student(2, "myname2", 20);
        Student student3 = new Student(3, "myname3", 17);
        Student student4 = new Student(4, "myname4", 10);
        Student student5 = new Student(5, "myname5", 19);
        Student student6 = new Student(6, "myname6", 19);
        Student student7 = new Student(2, "myname7", 21);
        list.add(student3);
        list.add(student1);
        list.add(student2);
        list.add(student5);
        list.add(student4);
        list.add(student7);
        StudentAgeComparator ageComparator = new StudentAgeComparator();
        System.out.println("Sinh viên tuổi lớn nhất:" + Collections.max(list,ageComparator));
        System.out.println("Sinh viên tuổi nhỏ nhất:" + Collections.min(list,ageComparator));
        Collections.sort(list, ageComparator);
        System.out.println("Sorted ASC:");
        print(list);
        System.out.println("\nSorted DSC:");
        Collections.reverse(list);
        print(list);
        System.out.println("\nSorted DSC sử dụng reverseOrder:");
        Comparator<Student> comparatorDSC = Collections.reverseOrder(ageComparator);
        Collections.sort(list, comparatorDSC);
        print(list);
        System.out.println("\nSorted ASC sử dụng reverseOrder:");
        Comparator<Student> comparatorASC = Collections.reverseOrder(comparatorDSC);
        Collections.sort(list, comparatorASC);
        print(list);
	}

}
