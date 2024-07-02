package method;

import java.util.Scanner;

public class EvenOdd01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int run = 1;
		while (run != 0) {
			decideEvenOdd();
			System.out.print("계속 하시겠습니까? 0-그만/1-계속 : ");
			run = sc.nextInt();
		}
	}

	public static void decideEvenOdd() {
		Scanner sc = new Scanner(System.in);

		System.out.print("판별할 숫자 입력 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
