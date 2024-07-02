package chap04;

class Printer {
	private int numOfPapers = 0;
	private boolean duplex;

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

	public void print(int amount) {
		String duplexOnOff = duplex ? "양면" : "단면";
		amount = duplex ? amount % 2 == 0 ? amount / 2 : amount / 2 + 1 : amount;
		
		
		
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
		} else if (numOfPapers >= amount) {
			numOfPapers -= amount;
			System.out.printf("%s으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", duplexOnOff, amount, numOfPapers);
		} else {
			System.out.printf("%s으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", duplexOnOff, amount - numOfPapers,
					numOfPapers);
			numOfPapers = 0;
		}
	}

}

public class PrinterTest {
	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}
