package chap02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int majorScore = sc.nextInt();
		System.out.print("교양 이수 학점 : ");
		int refScore = sc.nextInt();
		System.out.print("일반 이수 학점 : ");
		int normScore = sc.nextInt();
		
		int count = 0;
		
		if(majorScore >= 70) {
			count += 1;
		}
		if((refScore >= 30 && majorScore >= 30) || refScore + normScore >= 80) {
			count += 1;
		}
		if(count == 2) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 쌉불가능");
		}
	}
}
