package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.ArrayList;
import java.util.List;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator{
	
	public static final double PI = 3.14159265;
	
	private static List<String> statHistory = new ArrayList <>();
	
	public static double computeCircleArea(double r){
		
		return PI * r;
		
		
	}
	
//	public double sin(double rad){
//		double result = Math.sin(rad);
//		statHistory.add(""sin);
//		
//	}
	
//	public static void printGlobalOperations(){
//		
//	}
}
