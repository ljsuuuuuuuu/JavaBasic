package countableAB;

public class Tree extends Countable {

	public Tree(String name, int num) {
		super(name, num);
	}

	void ripen() {
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n", num, name);
	}
	
	@Override
	public void count() {
		System.out.printf("%s가 %d그루 있다.\n", name, num);
	}

}
