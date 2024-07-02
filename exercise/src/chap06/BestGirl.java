package chap06;

public class BestGirl extends GoodGirl {

	public BestGirl(String name) {
		super(name);
	}

	void show() {
		System.out.printf("%s는 자바를 무지하게 잘 안다.\n", name);
	}	
}
