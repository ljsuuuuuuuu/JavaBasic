package loop;

import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i += 1) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다",num , sum);
	}
}
