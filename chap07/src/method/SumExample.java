package method;

import java.util.Scanner;

public class SumExample {
	public static void main(String[] args) {
		//1.입력받기
		int num;
		
		//2 숫자가 양수이면 진행
		while ((num = getNumberKeyBoard("숫자를 입력하세요 : ")) > 0) {
			printSum(num);
		}
	}
	
 	public static int getNumberKeyBoard(String message) {
 		System.out.print(message);
 		Scanner sc = new Scanner(System.in);
 		return ;
	} 
 	
 	public static void printSum(int num) {
		int sum = 0;
		for (int i = 1; i < num+1; i += 1) {
			sum += i;
		}
		System.out.println(sum);
	}
 	
 	
}
