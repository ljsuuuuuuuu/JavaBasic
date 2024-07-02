package jump;

public class Continue01 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i += 1) {
			if (i == 4 || i == 7) {
				continue;
			}
			System.out.printf("[%d단]\n", i);
			for (int j = 1; j <= 9; j += 1) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
