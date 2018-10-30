package nullobjectpattern;

public class Rectangle implements Shape {
	private final double width;
	private final double height;
	
	public Rectangle() {
		this(1.0d, 1.0d);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (width * height);
	}
	
	@Override
	public void draw() {
		System.out.println("Vẽ hình chữ nhật với diện tích:" + area() + " và chu vi:" + perimeter());
		
	}
	
	@Override
	public boolean isNull() {
		return false;
	}
}
