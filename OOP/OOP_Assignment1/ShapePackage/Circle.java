package ShapePackage;

/**class Circle containing constructor Circle,methods draw and getArea
 * @author Chetna
 *
 */
/**
 * @author Admin22
 *
 */
public class Circle implements Shape {
	private int radius;

	/**
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	
	public void draw() {
		System.out.println("This is circle");
	}

	//to calculate area of circle
	public double getArea() {
		return (3.14 * radius * radius);
	}

}
