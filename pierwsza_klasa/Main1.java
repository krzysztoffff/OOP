package pierwsza_klasa;

public class Main1 {
	public static void main(String[] args) { // entry point
		Cat cat = new Cat();
		Dog dog = new Dog();
		String str1 = cat.whoAmI();
		String str2 = dog.whoAmI();

		if (str1 == str2) {
			System.out.println("nie mo¿liwe");

		} else {

			System.out.println(str1 + " " + str2);
		}

		// if (cat == dog){ //nie mo¿na porównaæ obiektów dwóch ró¿nych typów.
		// System.out.println("nie mo¿liwe");
		// }

		System.out.println(cat);
		System.out.println(dog); // domyœlnie wykonuje metodkê toString. W przypadku kota nadpisa³em toString
		// i zamiast krzaków mam ³adny napis

		printMe();

//		 System.out.println(this); // cannot use this in a static context

		 String str3 = "ala";
		 String str4 = "ola";
		
		 if (str3.equals(str4)){ 
		 System.out.println("\n\n równe \n\n");
		 }else{
		 System.out.println("\n\n nie równe \n\n");
		 }
		 cat.setAge(1);
		 cat.setName("Mruczek");
		 System.out.println(cat.whoIReallyAm());

	
	} //koniec Main


	public static void printMe() {
		Cat cat = new Cat();
		Cat cat2 = new Cat();
		System.out.println(cat.giveThis()); // domyœlnie u¿yte toString a my mamy nadpisane i ³adnie wypsuje tekst
		System.out.println(cat2); // j. w.
	}

}

class Main2 { // jest druga klasa ale w pliku mo¿e byætylko jedna klasa publiczna
	int x;
}