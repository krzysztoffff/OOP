package pierwsza_klasa;

import java.util.Random;

public class Bottle {

	double litresQuantity;

	public Bottle() {

	}

	public Bottle(double litresQuantity) {
		this.litresQuantity = litresQuantity;
	}

	public double getLitresQuantity() {
		return this.litresQuantity;
	}

	public boolean wlej(double ile) {

		if (ile > this.litresQuantity)
			return false;

		this.litresQuantity += ile;
		return true;
	}

	public static void main(String[] args) {

		Bottle[] b = new Bottle[30];
		Random r = new Random();

		for (int i = 0; i < b.length; i++) {
			b[i] = new Bottle(0.5);
		}

		int counter = 1;
		for (Bottle bottle : b) {

			if (bottle.wlej(r.nextDouble()))
				
				System.out.println(counter + ". " + bottle.getLitresQuantity());
				counter++;
		}
	}

}
