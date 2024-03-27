package chap03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String chul = sc.next();
		System.out.print("영희 : ");
		String young = sc.next();
		
		System.out.println(chul.equals(young));
	}
}
