package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main1 {
	
	public static void main(String[] args) {
		
		Attribute attr = new Attribute();
		System.out.println("Odpalam program");
		System.out.println(attr.publicAttribute);
		System.out.println(attr.protectedAttribute);//do protected mamy bo jete�my w tym samym pakiecie
	//	System.out.println(attr.privateAttribute);  nie da si� bo jest private
		
		attr.display();//w ten spos�b odpalam funkcj� display kt�ra wy�wietla prywatny atrybut
		
		
		
	}
	
	
}
