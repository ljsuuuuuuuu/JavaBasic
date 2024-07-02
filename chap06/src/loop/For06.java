package loop;

public class For06 {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i += 1) {
			System.out.printf("[ 구구단 %d단 ]\n", i);
			for(int j = 1; j < 10; j += 1) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}