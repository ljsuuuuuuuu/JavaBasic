package loop;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int mul = 1;
		for(int i = num; i > 0; i -= 1) {
			mul *= i;
		}
		System.out.printf("%d! = %d", num, mul);
	}
}
