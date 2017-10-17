package shape;

public class Square implements Shape {

	public Square(double length) {
		this.length = length;
	}
	private double length;
	@Override
	public double perimeter() {
		return length * 4;
	}

	@Override
	public double area() {
		return length * length;
	}

}
