package sequence;

import java.util.Scanner;

public class Sequence01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = sc.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Swapping 결과 > ");
		System.out.println("변수 a의 값 = " + a);
		System.out.println("변수 b의 값 = " + b);
	}
}
