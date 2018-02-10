package dziedziczenie;

public abstract class Monster {

	protected int hitPoints;
	protected int speed;

	public Monster() {
		System.out.println("konstruktor domyślny klasy Monster");
	}

	public Monster(int hitPoints, int speed) {
		super();
		this.hitPoints = hitPoints;
		this.speed = speed;
		System.out.println("konstruktor niedomyślny klasy Monster");
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	abstract public void attack();

	abstract public void defend();

}
