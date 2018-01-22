package a_Zadania.a_Dzien_1.b_Atrybuty;

public class Attribute {
	
	public String publicAttribute;
	private String privateAttribute = "private";
	protected String protectedAttribute = "test";
	
	public void display (){
		System.out.println(this.privateAttribute);
	}

}
