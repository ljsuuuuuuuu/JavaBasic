package star;

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int temp = 0;
		for (int i = 1; i < num + 1; i += 1) {
			for(int k = 0; k < num-i; k += 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + temp; j += 1) {
				System.out.print("*");
			}
			System.out.println();
			temp += 1;
		}
	}
}
