package chap02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println(num % 4 == 0 && num % 5 == 0);
		System.out.println(num % 4 == 0 || num % 5 == 0);
		System.out.println((num % 4 == 0 || num % 5 == 0) && (num % 4 == 0 && num % 5 == 0));
	}
}
