package method;

import java.util.Scanner;

public class Sum01 {
	public static void main(String[] args) {
		run();
	}

	public static void run() {
		while (input()) {}
	}

	public static boolean input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			sumMethod(num);
			return true;
		} else {
			return false;
		}
	}

	public static void sumMethod(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i += 1) {
			sum += i;
		}
		System.out.println(sum);
	}
}
