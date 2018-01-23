package pierwsza_klasa;

public class Main1 {
	public static void main(String[] args) { // entry point
		Cat cat = new Cat();
		Dog dog = new Dog();
		String str1 = cat.whoAmI();
		String str2 = dog.whoAmI();

		if (str1 == str2) {
			System.out.println("nie mo�liwe");

		} else {

			System.out.println(str1 + " " + str2);
		}

		// if (cat == dog){ //nie mo�na por�wna� obiekt�w dw�ch r�nych typ�w.
		// System.out.println("nie mo�liwe");
		// }

		System.out.println(cat);
		System.out.println(dog); // domy�lnie wykonuje metodk� toString. W przypadku kota nadpisa�em toString
		// i zamiast krzak�w mam �adny napis

		printMe();

//		 System.out.println(this); // cannot use this in a static context

		 String str3 = "ala";
		 String str4 = "ola";
		
		 if (str3.equals(str4)){ 
		 System.out.println("\n\n r�wne \n\n");
		 }else{
		 System.out.println("\n\n nie r�wne \n\n");
		 }
		 cat.setAge(1);
		 cat.setName("Mruczek");
		 System.out.println(cat.whoIReallyAm());

	
	} //koniec Main


	public static void printMe() {
		Cat cat = new Cat();
		Cat cat2 = new Cat();
		System.out.println(cat.giveThis()); // domy�lnie u�yte toString a my mamy nadpisane i �adnie wypsuje tekst
		System.out.println(cat2); // j. w.
	}

}

class Main2 { // jest druga klasa ale w pliku mo�e by�tylko jedna klasa publiczna
	int x;
}