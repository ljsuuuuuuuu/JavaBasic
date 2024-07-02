package chap03;

public class Ex09 {
	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	private static void foo(String string) {
		System.out.println(string);
	}

	private static void foo(String string, int i, int j) {
		System.out.printf("%s %d %d\n", string, i, j);
	}

	private static void foo(String string, int i) {
		System.out.printf("%s %d\n", string, i);

	}
}
