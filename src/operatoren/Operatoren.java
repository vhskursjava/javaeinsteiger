package operatoren;

public class Operatoren {

	public static void main(String[] args) {
		
		//Arithmetische Operatoren
		
		//Addition
		int sum = 165 + 100635 + 100 + 200;
		int a = 10;
		int b = 32;
		int aPlusB = a + b; 
		
		System.out.println("sum: " + sum);
		System.out.println(a + " + " + b + " = " + aPlusB);
		System.out.println(a + " + " + b + " = " + (a + b));
		
		//Subtraktion
		int diff = 120 - 22;
		System.out.println("diff: " + diff);
		
		//Multiplikation
		double prod = 12.5 * 13;
		System.out.println("prod: " + prod);
		
		//Division
		double val = 12.5 / 2.0;
		System.out.println("val: " + val);
		
		//Divisionsrest (Modulo)
		int mod = 12 % 5;
		System.out.println("mod: " + mod);
		System.out.println("mod2: " + (50 % 56));
		
		//Inkrement/Decrement
		
		//Increment
		int eineZahl = 100;
		eineZahl = eineZahl + 1; //Inkrement
		eineZahl += 1; //Bedeutet das gleiche wie eine Zeile drüber
		eineZahl++;
		++eineZahl;
		
		//Decrement
		eineZahl = eineZahl - 1;
		eineZahl -= 1;
		eineZahl--;
		--eineZahl;
		
		//Verkürzte Schreibweisen
		int eineAndereZahl = 200;
		eineAndereZahl = eineAndereZahl * 2;
		eineAndereZahl *= 2;
		
		
		
	}

}
