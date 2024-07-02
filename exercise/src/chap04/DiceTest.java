package chap04;

import java.util.Random;

class Dice {
	int face[] = { 1, 2, 3, 4, 5, 6 };

	public int roll() {
		Random r = new Random();
		return this.face[r.nextInt(5)];
	}
}

public class DiceTest {
	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());
	}
}
