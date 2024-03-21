package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		System.out.print("학생 수 입력 : ");
		int numStudent = Integer.parseInt(br.readLine());

		System.out.printf("%d명의 성적 입력 : ", numStudent);
		String inStr = br.readLine();

		StringTokenizer st = new StringTokenizer(inStr, " ");
		int studentScore[] = new int[numStudent];

		for (int i = 0; i < numStudent; i += 1) {
			studentScore[i] = Integer.parseInt(st.nextToken());
			sum += studentScore[i];
		}

		System.out.printf("합계 : %d(%d명)%n", sum, numStudent);
		System.out.printf("평균 : %d", sum / numStudent);

	}
}
