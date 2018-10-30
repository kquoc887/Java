package nullobjectpattern;

public class NullShape implements Shape {
	
	@Override
	public double perimeter() {
		return 0;
	}
	
	@Override
	public double area() {
		return 0;
	}
	
	@Override
	public void draw() {
		System.out.println("Null object can't be draw");
		
	}
	
	@Override
	public boolean isNull() {
		return true;
	}
}
