package chap06;

class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}
}

class ColoredCircle extends Circle {

	String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		
		c1.show();
		c2.show();
	}	
}
