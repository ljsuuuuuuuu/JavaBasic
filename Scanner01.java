package scanner;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 타입 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("실수 타입 숫자를 입력하세요 : ");
		double num2 = sc.nextDouble();
		System.out.println();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
	}
}
