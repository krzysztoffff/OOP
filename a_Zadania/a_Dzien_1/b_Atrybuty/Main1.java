package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main1 {
	
	public static void main(String[] args) {
		
		Attribute attr = new Attribute();
		System.out.println("Odpalam program");
		System.out.println(attr.publicAttribute);
		System.out.println(attr.protectedAttribute);//do protected mamy bo jeteśmy w tym samym pakiecie
	//	System.out.println(attr.privateAttribute);  nie da się bo jest private
		
		attr.display();//w ten sposób odpalam funkcję display która wyświetla prywatny atrybut
		
		
		
	}
	
	
}
