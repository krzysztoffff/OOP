<h3>OOP training</h3>

### Zadanie 1.
Utw�rz klas� `User`. 

Klasa ma zawiera� nast�puj�ce atrybuty:

	*firstName
	*lastName
	*email
	
1. Klasa ma zawiera� getery i setery do wszystkich p�l, konstruktor domy�lny, konstruktor ustawiaj�cy wszystkie pola.
2. Klasa ma zawiera� metod� o sygnaturze `welcome()` zwracaj�c� napis `Hello User ` + firstName + lastName;
	
Utw�rz klas� `Department`. 

Klasa ma zawiera� nast�puj�ce atrybuty:

	*name

Klasa ma zawiera� getery i setery do wszystkich p�l, konstruktor domy�lny, konstruktor ustawiaj�cy wszystkie pola.

Utw�rz klas� `Manager`,

Klasa ma spe�nia� nast�puj�ce w�a�ciwo�ci:
1. Dziedziczy� po `User`.
2. Posiada� atrybut prywatny zawieraj�cy tablic� referencji do obiekt�w klasy User.	
3. Posiada� atrybut prywatny zawieraj�cy referencje do obiektu klasy `Department`
4. Posiada� nadpisan� metod� `welcome()` zwracaj�c� napis `Hello Manager ` + firstName + lastName;

### Zadanie 2

1. Utw�rz klas� `BMI`.
Klasa ma posiada�:
 * atrybut typu `double` - weight
 * atrybut typu `double` - height
 * konstruktor, kt�ry pozwoli ustawi� atrybuty `weight` oraz `height`.
 * metod� publiczn�  `calculate double ()`, kt�ra obliczy BMI - body mass index dla atrybut�w.
 * statyczn� tablic� `double[] history` - tablica ma zawiera� histori� ka�dego wyniku wywo�ania metody `calculate`
 * metod� `double bmiAvg()` - kt�ra zwr�ci �redni� wszystkich wynik�w.
 
2. Aby obliczy� BMI nale�y podzieli� wag� (w kilogramach) przez wzrost (w metrach) podniesiony do kwadratu (waga /(wzrost ^2)).
3. Metoda otrzymuje wag� w kilogramach ale wzrost w centymetrach.
4. Metoda ma zwr�ci� wyliczone BMI z dok�adno�ci� 2 miejsc po przecinku. 
