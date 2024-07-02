package chap06;

public class Girl {
	protected String name;
	public Girl(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.printf("%s는 자바 초보자이다.\n", name);
	}
}
