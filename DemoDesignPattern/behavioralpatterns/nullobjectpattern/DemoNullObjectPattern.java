package nullobjectpattern;

public class DemoNullObjectPattern {

	public static void main(String[] args) {
		String[] shapeTypes = new String[] {"Circle", "Rectangle" , "Pentagon",};
		for (String shapeType : shapeTypes) {
			Shape shape = ShapeFactory.createShape(shapeType);
			System.out.println("Diện tích:" + shape.area());
			System.out.println("Chu vi:" + shape.perimeter());
			shape.draw();
			System.out.println();	
		}
		
	}

}
