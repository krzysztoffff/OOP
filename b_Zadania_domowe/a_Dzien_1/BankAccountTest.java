package b_Zadania_domowe.a_Dzien_1;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount(879654323);
		
		b.depositCash(18000);
		System.out.println("Stan konta "+b.getCash()+" nr konta "+b.getNumber());
		b.withdrawCash(50000);
		System.out.println("\n"+b.printInfo());
		
		
	}

}
