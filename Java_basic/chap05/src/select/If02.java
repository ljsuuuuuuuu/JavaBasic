package select;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
