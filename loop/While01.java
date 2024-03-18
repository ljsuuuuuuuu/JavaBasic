package loop;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= num1) {
			sum += i;
			i += 1;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num1, sum);
	}
}
