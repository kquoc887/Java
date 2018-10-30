package nullobjectpattern;

public class Circle implements Shape {
	private final double radius;
	
	public Circle() {
		this(1.0d);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public void draw() {
		System.out.println("Vẽ hình tròn với diện tích:" + area() + " and chu vi:" + perimeter());
		
	}
	
	@Override
	public boolean isNull() {
		return false;
	}
}
