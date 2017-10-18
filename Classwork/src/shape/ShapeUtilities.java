package shape;
import java.util.Random;
public class ShapeUtilities {

	public static Shape randomShape() {
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x) {
		case 0 :
			return new Circle(r.nextInt(100)+1);
		case 1 :
			return new Rectangle(r.nextInt(100) + 1, r.nextInt(100) + 1);
		default :
			return new Square(r.nextInt(100)+1);
		}
	}
	
	public static double sumPerimeter(Shape[]shapeArr) {
		double total = 0;
		for(int count = 0; count < shapeArr.length; count++) {
			total += shapeArr[count].perimeter();
		}
		return total;
	}
	
	public static double sumArea(Shape[]shapeArr) {
		double total = 0;
		for(int count = 0; count < shapeArr.length; count++) {
			total += shapeArr[count].area();
		}
		return total;
	}
}
