package countable;

public class Bird implements Countable {

	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	void fly() {
		System.out.printf("2마리 %s가 날아간다.\n", name);
	}
	
	@Override
	public void count() {
		System.out.printf("%s가 2마리 있다.\n", name);
	}

}
