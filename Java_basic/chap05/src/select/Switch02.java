package select;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급 입력 : ");
		String grade = sc.nextLine();
		
		switch (grade) {
		case "A":
		case "B":
			System.out.println("아주 열심히 하셨군요");
			break;
		case "C":
			System.out.println("남들만큼 하셨네요");
			break;
		case "D":
			System.out.println("조금 더 노력이 필요합니다");
			break;
		case "F":
			System.out.println("교수실로 찾아오세요");
			break;

		default:
			System.out.println("잘못된 값 입력");
			break;
		}
	}
}
