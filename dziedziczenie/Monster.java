package dziedziczenie;

public abstract class Monster {

	protected int hitPoints;
	protected int speed;
	protected String name;

	public Monster() {
		System.out.println("konstruktor domyœlny klasy Monster");
	}

	public Monster(int hitPoints, int speed) {
		super();
		this.hitPoints = hitPoints;
		this.speed = speed;
		System.out.println("konstruktor niedomyœlny klasy Monster");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public void attack(Monster m) {
		if (m.hitPoints > this.hitPoints) {
			System.out.println("Wygrywa " + m.getName());
		}else {
			System.out.println("Wygrywa " + this.getName());
		}
	}

}
