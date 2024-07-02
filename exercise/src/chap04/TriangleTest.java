package chap04;

class Triangle {
	private double height;
	private double baseLine;

	public Triangle(double height, double baseLine) {
		this.baseLine = baseLine;
		this.height = height;
	}

	public double findArea() {
		return height * baseLine / 2;
	}

	public boolean isSameArea(Triangle t) {
		if (t.findArea() == this.findArea()) {
			return true;
		}
		return false;
	}

	public double getBaseLine() {
		return baseLine;
	}

	public double getHeight() {
		return height;
	}
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(80.0, 8.0);
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}
}
