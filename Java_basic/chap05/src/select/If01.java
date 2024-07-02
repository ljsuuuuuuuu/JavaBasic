package select;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int num3 = sc.nextInt();
		int max = num1;
		
		if(num2 > max) {
			max = num2;
		}
		if(num3 > max) {
			max = num3;
		}
		
		System.out.println("가장 큰 수는 " + max);
	}
}
