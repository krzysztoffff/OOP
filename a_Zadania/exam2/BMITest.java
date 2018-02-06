package a_Zadania.exam2;

public class BMITest {

	public static void main(String[] args) {
		BMI bmi = new BMI(83.0, 1.85);
		BMI bmi2 = new BMI(73.0, 2.0);
		BMI bmi3 = new BMI(93.0, 1.98);
		BMI bmi4 = new BMI(103.0, 1.75);
		
		bmi.calculateDouble();
		bmi2.calculateDouble();
		bmi3.calculateDouble();
		bmi4.calculateDouble();
		
		System.out.println(BMI.history.toString());
		
		System.out.println(bmi.bmiAvg());
		System.out.println(bmi2.bmiAvg());
		System.out.format("%.2f%n", bmi3.bmiAvg()); //ten sam wynik dla ka¿dego obiektu. history jest static  formatuje ale nie zaokr¹glam
		
		
	}
	
}
