<h3>OOP training</h3>

### Zadanie 1.
Utwórz klasê `User`. 

Klasa ma zawieraæ nastêpuj¹ce atrybuty:

	*firstName
	*lastName
	*email
	
1. Klasa ma zawieraæ getery i setery do wszystkich pól, konstruktor domyœlny, konstruktor ustawiaj¹cy wszystkie pola.
2. Klasa ma zawieraæ metodê o sygnaturze `welcome()` zwracaj¹c¹ napis `Hello User ` + firstName + lastName;
	
Utwórz klasê `Department`. 

Klasa ma zawieraæ nastêpuj¹ce atrybuty:

	*name

Klasa ma zawieraæ getery i setery do wszystkich pól, konstruktor domyœlny, konstruktor ustawiaj¹cy wszystkie pola.

Utwórz klasê `Manager`,

Klasa ma spe³niaæ nastêpuj¹ce w³aœciwoœci:
1. Dziedziczyæ po `User`.
2. Posiadaæ atrybut prywatny zawieraj¹cy tablicê referencji do obiektów klasy User.	
3. Posiadaæ atrybut prywatny zawieraj¹cy referencje do obiektu klasy `Department`
4. Posiadaæ nadpisan¹ metodê `welcome()` zwracaj¹c¹ napis `Hello Manager ` + firstName + lastName;

### Zadanie 2

1. Utwórz klasê `BMI`.
Klasa ma posiadaæ:
 * atrybut typu `double` - weight
 * atrybut typu `double` - height
 * konstruktor, który pozwoli ustawiæ atrybuty `weight` oraz `height`.
 * metodê publiczn¹  `calculate double ()`, która obliczy BMI - body mass index dla atrybutów.
 * statyczn¹ tablicê `double[] history` - tablica ma zawieraæ historiê ka¿dego wyniku wywo³ania metody `calculate`
 * metodê `double bmiAvg()` - która zwróci œredni¹ wszystkich wyników.
 
2. Aby obliczyæ BMI nale¿y podzieliæ wagê (w kilogramach) przez wzrost (w metrach) podniesiony do kwadratu (waga /(wzrost ^2)).
3. Metoda otrzymuje wagê w kilogramach ale wzrost w centymetrach.
4. Metoda ma zwróciæ wyliczone BMI z dok³adnoœci¹ 2 miejsc po przecinku. 
