package shape;

public class Triangle implements Shape {

	private double side;
	private double side2;
	private double side3;        
	public Triangle(double side, double side2, double side3) {
		this.side = side;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double area() {
		double p = ((side + side2 + side3)/2);
		double a = Math.sqrt(p * (p-side) * (p-side2) * (p-side3));
		return a;
	}
	
	public double perimeter() {
		return side + side2 + side3;
	}
	
	public String stringTo() {
		return "Triangle Sides: " + side + ", " + side2 + ", " + side3 + "Area: " + this.area() + "Perimeter: " + this.perimeter();
	}
}
