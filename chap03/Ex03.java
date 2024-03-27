package chap03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do {
			if(num % 2 == 0) {
				sum += num;
			}
			System.out.print("양의 정수를 입력하세요 : ");
		} while ((num = sc.nextInt()) > 0);
		System.out.printf("입력한 양의 정수 중에서 짝수의 합은 : %d", sum);
	}
}
