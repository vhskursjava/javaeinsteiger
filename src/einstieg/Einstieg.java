package einstieg;
import java.util.Scanner;

public class Einstieg {

	public static void main(String[] args) {
		
		//Das ist ein einzeiliger Kommentar
		
		/*
		 * Das
		 * ist
		 * ein
		 * mehrzeiliger
		 * Kommentar
		 * */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- Dollar in Euro Umrechner ---");
		System.out.print("Dollar: ");
		double dollar = Double.parseDouble(scanner.nextLine());
		System.out.print("Kurs: ");
		double kurs = Double.parseDouble(scanner.nextLine());
		
		double euro = dollar * kurs;
		System.out.println("Euro: " + String.format("%.2f", euro));
		
		scanner.close();
	}

}
