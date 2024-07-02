package classtest;

import java.util.Scanner;

public class CircleDemo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		Circle02 c1 = new Circle02(sc.nextDouble());
		c1.show(c1.getRadius(), c1.getArea());
	}
}
