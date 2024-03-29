package chap03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();

		if (isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
	}

	private static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1; i <= num; i += 1) {
			if(num % i == 0) {
				count += 1;
			}
		}
		if(count != 2) {
			return false;			
		}
		return true;
	}
}
