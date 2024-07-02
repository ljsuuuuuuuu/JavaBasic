package chap06;

public class GoodGirl extends Girl {

	public GoodGirl(String name) {
		super(name);
	}
	
	void show() {
		System.out.printf("%s는 자바를 잘 안다.\n", name);
	}
}
