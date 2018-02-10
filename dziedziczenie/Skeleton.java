package dziedziczenie;

public class Skeleton extends Monster {
	private String weapon;

	public Skeleton() {
		System.out.println("konstruktor domy�lny klasy Skeleton");
	}

	public Skeleton(int hp, int speed, String weapon) {
		super(hp, speed);
		super.setName("Skeleton");
		this.weapon = weapon;
		System.out.println("konstruktor niedomy�lny klasy Skeleton");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	
	@Override
	public void attack() {
		System.out.println(this.name + " Atakuje");
	}

	@Override
	public void defend() {
		System.out.println(this.name + " broni si�");
	}

	public void defend(String defendType) {
		System.out.println(this.name + " broni si� z u�yciem" + defendType);
	}

}
