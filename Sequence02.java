package sequence;

import java.util.Scanner;

public class Sequence02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요(원) : ");
		int won = sc.nextInt();
		int coin500 = won / 500;
		int coin100 = won % 500 /100;
		System.out.println(">> 500원 동전 " + coin500 + "개와 100원 동전 " + coin100 + "개가 필요합니다.");
	}
}
