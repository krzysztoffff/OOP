package dziedziczenie;

public class Fight {

	public static void main(String[] args) {

		Monster s = new Skeleton(40, 120, "Bow");
		Monster z = new Zombie(140, 60, "Axe");

		s.attack();
		z.attack();
		z.defend();

		s.attack(z);

	}

}
