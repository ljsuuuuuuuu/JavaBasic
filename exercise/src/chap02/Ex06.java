package chap02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨온도 입력 : ");
		int temF = sc.nextInt();
		double temC = (double)(temF - 32) * 5 / 9;
		System.out.printf("화씨온도 : %d 변환한 섭씨온도 : %f", temF, temC);
		
	}
}
