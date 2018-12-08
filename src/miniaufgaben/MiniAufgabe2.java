package miniaufgaben;

import java.util.Scanner;

public class MiniAufgabe2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wie alt bist du?: ");
		int deinAlter = scanner.nextInt();
		
		System.out.println("Du bist " + deinAlter + " Jahre alt");
		
		if(deinAlter >= 67) {
			System.out.println("Du bist Rentner!");
		} else if (deinAlter >= 0) {
			System.out.println("Du bist noch jung!");
		} else {
			System.out.println("Das kann ja gar nicht sein!");
		}
		
		
	}

}
