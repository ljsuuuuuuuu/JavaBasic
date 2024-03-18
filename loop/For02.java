package loop;

import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");
		int sum = 0;
		for(int i = 0; i < 5; i += 1) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.printf("5개의 숫자의 합은 %d입니다", sum);
	}
}
