package star;

import java.util.Scanner;

public class Star01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i < num + 1; i += 1) {
			for (int j = 0; j < i; j += 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
