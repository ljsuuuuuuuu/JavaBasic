package loop;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		System.out.print("양의 숫자를 입력하세요 : ");
		for(int i = 0; i < 1;) {
			num = sc.nextInt();
			if(num <= 0) {
				System.out.print("양의숫자가 아닙니다. 다시 입력하세요 : ");
			} else {
				for(int j = 1; j <= num; j += 1) {
					sum += j;
				}
				i += 1;
			}
			
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
	}
}
