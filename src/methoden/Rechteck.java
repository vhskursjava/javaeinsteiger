package methoden;

public class Rechteck {

	public static double flaeche(double a, double b) {
		return a * b;
	}
	
	public static double umfang(double a, double b) {
		return 2 * (a + b);
	}
	
	public static double diagonale(double a, double b) {
		double val = a*a + b*b;
		return Math.sqrt(val);
	}
	
	public static double umkreis(double a, double b) {
		return 0.5 * diagonale(a, b);
	}
}
