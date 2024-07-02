package chap06;

class Phone {
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.printf("%s가 통화 중이다.\n", owner);
	}
}

class Telephone extends Phone {
	private String when;

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	void autoAnswering() {
		System.out.printf("%s가 없다. %s 전화 줄래.\n", owner, when);
	}
}

class Smartphone extends Telephone {
	private String game;

	public Smartphone(String owner, String game) {
		super(owner, null);
		this.game = game;
	}

	void playGame() {
		System.out.printf("%s가 %s 게임을 하는 중이다.", owner, game);
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Phone phones[] = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };
		
		for(Phone p : phones) {
			if(p instanceof Smartphone) {
				((Smartphone) p).playGame();
			} else if (p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			} else if (p instanceof Phone) {
				p.talk();
			}
		}
	}
}
