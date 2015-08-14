package ShapePackage;

/**
 * @author Chetna
 *
 */
public class Square implements Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void draw() {
		System.out.print("This is square");
	}
	//to calculate area of Square
	public double getArea() {
		return (side * side);
	}
}
