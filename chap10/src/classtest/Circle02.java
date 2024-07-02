package classtest;

public class Circle02 {
	
	private double radius;
	final double PI = 3.14;

	public Circle02(double nextDouble) {
		radius = nextDouble;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	double getArea() {
		return PI * radius * radius;
	}
	
	void show(double radius, double area) {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
}
