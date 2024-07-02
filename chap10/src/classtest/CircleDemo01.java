package classtest;

import java.util.Scanner;

public class CircleDemo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		Circle c1 = new Circle(sc.nextDouble());
		c1.show(c1.getArea());
	}
}