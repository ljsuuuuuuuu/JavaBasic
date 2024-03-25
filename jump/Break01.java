package jump;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Break01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			num = Integer.parseInt(br.readLine());
			if(num <= 0) {
				System.out.println("0보다 큰 숫자를 입력하세요.");
			} else {
				break;
			}
		}
		
		int sum = 0;
		for(int i = 1; i <= num; i += 1) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d", num, sum);
	}
}
