package loop;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.printf("[ 구구단 %d단 ]\n", num);
		for(int i = 1; i < 10; i += 1) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}
