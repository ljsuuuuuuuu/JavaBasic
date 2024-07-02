package chap02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		System.out.print("원기둥의 밑면 반지름 입력 : ");
		int r = sc.nextInt();
		System.out.print("원기둥의 높이 입력 : ");
		int h = sc.nextInt();
		System.out.print("원기둥의 부피는 : " + r * r * h * PI);
		
	}
}
