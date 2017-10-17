package shape;

public class Circle implements Shape {

	private double radius;
	private static double pi = 3.14;
	public Circle(double rad) {
		this.radius = rad;
	}
	public double area() {
		return radius * radius * pi;
	}
	@Override
	public double perimeter() {
		return radius * 2 * pi;
	}
}
