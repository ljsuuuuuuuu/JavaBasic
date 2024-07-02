package method;

public class NineNineExample {
	public static void main(String[] args) {
		runNineNine();
	}
	
	public static void runNineNine() {
		for(int i = 2; i < 10; i += 1) {
			printNineNine(i);
		}
	}
	
	public static void printNineNine(int i) {
		System.out.printf("[ 구구단 %d단 ]\n", i);
		for(int j = 1; j < 10; j += 1) {
			System.out.printf("%d x %d = %d\n", i, j, i*j);
		}
		System.out.println();
	
	}
}
