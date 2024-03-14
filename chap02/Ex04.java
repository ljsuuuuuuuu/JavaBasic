package chap02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수 입력 : ");
		int time = sc.nextInt();
		
		int hour = time / 3600;
		int min = time % 3600 / 60;
		int sec = time % 60;
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초");
	}
}
