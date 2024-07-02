package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max01 {
	public static void main(String[] args) throws IOException {
		run();
	}
	
	public static void run() throws IOException {
		while(inputNum()) {}
	}
	
	public static boolean inputNum() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자3개 입력(숫자 3개 모두 한줄에 입력. 숫자 3개 모두 0 입력시 종료) : ");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		return idRun(num1, num2, num3);
	}
	
	public static boolean idRun(int num1, int num2, int num3) {
		if(num1 == 0 && num2 == 0 && num3 == 0) {
			System.out.println("시스템 종료");
			return false;
		} else {
			System.out.printf("최대값은 %d입니다\n",getMax(num1, num2, num3));
			return true;
		}
	}
	
	public static int getMax(int num1, int num2, int num3) {
		int max = num1;
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		return max;
	}
}