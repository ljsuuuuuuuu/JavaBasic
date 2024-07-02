package chap02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 999 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		int hun = num / 100;
		int ten = num % 100 / 10;
		int one = num % 10 / 1;
		System.out.println(hun + ten + one);
	}
}
