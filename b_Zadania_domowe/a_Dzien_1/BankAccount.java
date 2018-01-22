package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {
	int number;
	double cash = 0.00;

	public BankAccount(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;

	}

	public double getCash() {
		return this.cash;
	}

	void depositCash(double amount) {
		if (amount > 0) {
			this.cash += amount;
			System.out.println("Wpłacono " + amount);
		} else {
			System.out.println("Wprować poprawną wartość pieniądza");
		}
	}

	public double withdrawCash(double amount) {
		double possibleCash = 0;
		if (amount > 0) {
			if (amount >= this.cash) {
				System.out.println("Wypłacam tylko " + this.cash + " gdyż nie ma więcej dostępnych środków.");
				possibleCash = this.cash;
				this.cash = 0;
			} else {
				possibleCash = amount;
				this.cash -= amount;
				System.out.println("Wypłacam: " + amount);
			}
		} else {
			System.out.println("Wprować poprawną wartość pieniądza do wypłaty");
		}
		return possibleCash;
	}
	
	public String printInfo(){
		String numberInfo = Integer.toString(this.number);
		String cashInfo = Double.toString(this.cash);
		String info = "Numer konta: "+numberInfo+" Saldo: "+cashInfo;
		return info;
	}

}
