package select;

import java.util.Scanner;

public class StringConv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 3개 입력 : ");
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		int num3 = Integer.parseInt(sc.next());
		
		int max = num1;
		if(num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		
		System.out.println("가장 큰 수는 : " + max);
	}
}
