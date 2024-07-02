package chap03;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int num) {
		int mul = 1;
		switch (num) {
		case 5:
			mul *= 5;
		case 4:
			mul *= 4;
		case 3:
			mul *= 3;
		case 2:
			mul *= 2;
		case 1:
			mul *= 1;
		}
		return mul;
	}
}
