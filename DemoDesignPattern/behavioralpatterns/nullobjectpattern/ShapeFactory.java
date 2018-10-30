package nullobjectpattern;

public class ShapeFactory {
	public static Shape createShape(String shapeType) {
		Shape shape = null;
		if (shapeType.equalsIgnoreCase("Circle")) {
			shape = new Circle();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			shape = new Rectangle();
		} else {
			shape = new NullShape();
		}
		return shape;
	}
}
