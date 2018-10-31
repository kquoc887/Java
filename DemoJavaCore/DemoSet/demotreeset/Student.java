package demotreeset;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [id = " + id + ", name = " + name + "]";
	}
	@Override
	public int compareTo(Student student) {
		return this.getName().compareTo(student.getName());
	}
}
