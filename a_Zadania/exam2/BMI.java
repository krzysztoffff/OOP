package a_Zadania.exam2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BMI {

	private double weight;// otrzymuje w kilogramach
	private double height;// otrzymuje w centymetrach

	public static List<Double> history = new ArrayList<>();

	public BMI(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public double calculateDouble() {
		double heightInMeters = this.height / 100; //do obliczenia wzrost potrzebny jest w metrach
		double res = Math.pow(this.weight / heightInMeters, 2);
		
		history.add(res);
		return res;
	}
	
	public double bmiAvg() {
		double bmiSum = 0.0;
		for(double bmi : history) {
			bmiSum += bmi;
		}
		
		double res = bmiSum / history.size();
//		NumberFormat formatter = new DecimalFormat("#0.00"); 
//		String formatedRes = formatter.format(res);
//		double finalResult = Double.parseDouble(formatedRes);
		
		return res;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
