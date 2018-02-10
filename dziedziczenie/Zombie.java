package dziedziczenie;

public class Zombie extends Monster {
	String name = "Zombie";
	String weapon;

	public Zombie() {
		System.out.println("konstruktor domyœlny klasy Zombie");
	}

	public Zombie(int hp, int speed, String weapon) {
		super(hp, speed);
		this.weapon = weapon;
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
		System.out.println(this.name + " broni siê");
	}

}
