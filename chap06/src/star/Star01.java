package star;

import java.util.Scanner;

public class Star01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i += 1) {
			for (int j = 0; j < i+1; j += 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
