package star;

import java.util.Scanner;

public class Star06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int temp = num - 1;
		for (int i = 1; i < num + 1; i += 1) {
			for(int k = 0; k < i-1; k += 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < num + 1 + temp - i; j += 1) {
				System.out.print("*");
			}
			temp -= 1;
			System.out.println();
		}
	}
}