package a_Zadania.exam2;

import java.util.ArrayList;
import java.util.List;

public class BMI {

	private double weight;// podaj w kilogramach
	private double height;// podaj w metrach

	public static List<Double> history = new ArrayList<>();

	public BMI(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public double calculateDouble() {
		double res = Math.pow(this.weight / this.height, 2);
		history.add(res);
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
