package select;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		switch (num % 2) {
		case 0:
			System.out.println("짝수");
			break;

		default:
			System.out.println("홀수");
			break;
		}
	}
}
