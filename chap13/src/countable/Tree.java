package countable;

public class Tree implements Countable {

	String name;
	
	public Tree(String name) {
		this.name = name;
	}
	
	void ripen() {
		System.out.printf("%s에 열매가 잘 익었다.\n", name);
	}
	
	@Override
	public void count() {
		System.out.printf("%s가 5그루 있다.\n", name);
	}

}
