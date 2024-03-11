package scanner;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요.(cm) : ");
		int r = sc.nextInt();
		double round = r*r*pi;
		System.out.println("원의 넓이는 " + round + "입니다.");
		
	}
}
