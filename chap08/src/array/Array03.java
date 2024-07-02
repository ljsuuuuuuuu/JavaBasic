package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {
	public static void main(String[] args) throws IOException {
		run();
	}

	public static void run() throws IOException {
		int numStudent = getStudentNumber();
		int[] scores = getStudentScore(numStudent);
		printSumAndAv(scores);
	}

	private static int[] getStudentScore(int numStudent) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int scores[] = new int[numStudent];

		System.out.printf("%d명의 점수 입력 : ", numStudent);
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < scores.length; i += 1) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		return scores;
	}

	public static int getStudentNumber() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수 입력 : ");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		return Integer.parseInt(st.nextToken());
	}

	public static void printSumAndAv(int scores[]) {
		int sum = 0;
		for (int i = 0; i < scores.length; i += 1) {
			sum += scores[i];
		}
		System.out.printf("합계 : %d%n", sum);
		System.out.printf("평균 : %d", sum / scores.length);
	}
}
