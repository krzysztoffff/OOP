package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

	// private String [] operationTab = new String [0]; // trzeba zdefiniowa�
	// rozmiar tablicy co czyni tablic� z�ym rozwi�zaniem

	private List<String> history = new ArrayList<>(); // obiekt tablica dynamiczna
	static List<String> statHistory = new ArrayList<>();

	public Calculator() {

	}

	public void sAddHistory(String str) {
		statHistory.add(str);
	}

	private void addHistory(String str) {
		this.history.add(str);
	}

	public double pow(double num1, double num2) {
		double result = Math.pow(num1, num2); // pot�ga
		addHistory(Double.toString(num1) + " do pot�gi " + Double.toString(num2) + " = " + Double.toString(result));
		return result;
	}

	public double root(double num1, double num2) {
		double result = Math.pow(num1, 1 / num2); // pierwiastek num2 stopnia z num1.
													// pierwiastek drugiego
													// stopnia to sqrt
		addHistory("pierwiastek z " + Double.toString(num1) + " " + Double.toString(num2) + " stopnia = "
				+ Double.toString(result));
		return result;

	}

	public void printOperations() {// wy�wietlia tablice
		for (int i = 0; i < history.size(); i++) {

			System.out.println(this.history.get(i));

		}

	}

	public void sPrintOperations() {// wy�wietlia tablice
		for (int i = 0; i < statHistory.size(); i++) {

			System.out.println(statHistory.get(i));

		}

	}

	public static void printGlobalOperations(int length) {
		int done = 0;
		List<String> reversed = new ArrayList<>(statHistory);
		Collections.reverse(reversed);
		for (String s : reversed) {
			if (done >= length) {
				return;
			}
			done++;
			System.out.println(s);
		}

	}
	public static void printGlobalOperations(String length) {

		try {
			int len = Integer.parseInt(length);
			printGlobalOperations(len);
		} catch (NumberFormatException e) {
			System.out.println("przechwycono NumberFormatException");
		}
	}

	public void clearList() {
		this.history.clear();
		// this.history.removeAll(history);

	}

	public void sClearList() {
		this.statHistory.clear();
		// this.history.removeAll(history);

	}

	// wyczy�ci� tablice operacja kt�ra metoda ma specjaln� operacje do czyszczenia

	public double add(double num1, double num2) {
		double result = num1 + num2;
		String text = "Added " + String.valueOf(num1) + " + " + String.valueOf(num2) + " got result "
				+ String.valueOf(result);
		addHistory(text);
		return result;
	}

	public double multiply(double num1, double num2) {
		double result = num1 * num2;
		String text = "Multiplied " + String.valueOf(num1) + " * " + String.valueOf(num2) + " got result "
				+ String.valueOf(result);
		addHistory(text);
		return result;
	}

	public double substract(double num1, double num2) {
		double result = num1 - num2;
		String text = "Substracted " + String.valueOf(num1) + " - " + String.valueOf(num2) + " got result "
				+ String.valueOf(result);
		addHistory(text);
		return result;
	}

	public double divide(double num1, double num2) {
		double result = num1 / num2;
		String text = "Divided " + String.valueOf(num1) + " / " + String.valueOf(num2) + " got result "
				+ String.valueOf(result);
		addHistory(text);
		return result;
	}

}
