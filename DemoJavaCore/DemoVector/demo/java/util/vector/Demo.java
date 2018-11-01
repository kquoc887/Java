package demo.java.util.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		Vector<Number> vector = new Vector(3,2);
		System.out.println("Size ban đầu:" + vector.size());
		System.out.println("Sức chứa ban đầu:" + vector.capacity());
		vector.addElement(new Integer(1));
		vector.addElement(new Integer(2));
		vector.addElement(new Integer(3));
		vector.addElement(new Integer(4));
		System.out.println("Size sau khi thêm:" + vector.size());
		System.out.println("Capacity sau khi thêm:" + vector.capacity());
		vector.addElement(new  Double(5.45));
		System.out.println("Capacity hiện tại:" + vector.capacity());
		vector.addElement(new  Double(6.08));
		vector.addElement(new Integer(7));
		System.out.println("Capacity hiện tại:" + vector.capacity());
		System.out.println("Phần tử đầu tiên:" + vector.firstElement());
		System.out.println("Phần tử cuối cùng:" + vector.lastElement());
		Enumeration<Number> enumeration = vector.elements();
		System.out.println("Các phần tử trong Vector:");
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}
		
	}
}
