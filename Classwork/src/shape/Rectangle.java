package shape;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double perimeter() {
		return length * 2 + width * 2;
	}

	@Override
	public double area() {
		return length * width;
	}

	
}
