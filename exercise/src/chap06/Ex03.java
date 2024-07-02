package chap06;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	@Override
	public String toString() {
		return "좌표 [x=" + x + ", y=" + y + "]";
	}

}

class MovalbePoint extends Point {
	private int xSpeed, ySpeed;

	public MovalbePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getXSpeed() {
		return this.xSpeed;
	}

	public int getYSpeed() {
		return this.ySpeed;
	}

	@Override
	public String toString() {
		return super.toString() + " 이동속도 [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

}

public class Ex03 {
	public static void main(String[] args) {
		Point p = new Point(1, 1);
		MovalbePoint mp = new MovalbePoint(12, 12, 111, 111);
		
		System.out.println(p.toString());
		System.out.println(mp.toString());
	}
}
