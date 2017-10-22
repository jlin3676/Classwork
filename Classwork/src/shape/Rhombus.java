package shape;

public class Rhombus implements Shape {

	private double diag;
	private double diag2;
	private double side;
	public Rhombus(double diag, double diag2, double side) {
		this.diag = diag;
		this.diag2 = diag2;
		this.side = side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}

	@Override
	public double area() {
		return ((diag * diag2)/2);
	}
	
	public String toString() {
		return "Rhombus Diagonals: " + diag + ", " + diag2 + " Side: " + side + " Area: " + this.area() + " Perimeter: " + this.perimeter();
	}
}
