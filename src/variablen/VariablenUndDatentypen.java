package variablen;

public class VariablenUndDatentypen {

	public static void main(String[] args) {

		// Deklaration einer Variable vom Typ int mit dem Namen meineIntegerVariable
		int meineIntegerVariable;
		// Initialisierung der Variable meineIntegerVariable mit dem Wert 12
		meineIntegerVariable = 12;

		System.out.println(meineIntegerVariable);

		meineIntegerVariable = 1100;

		System.out.println(meineIntegerVariable);
		
		//Definition der Variable meineVariable2 mit dem Wert 42
		int meineVariable2 = 42;
		//Wertzuweisung
		meineVariable2 = 100;
		
		//Eine Variable MUSS vor ihrer Verwendung initialisiert worden sein
		int meineDeklaration;
		//System.out.println(meineDeklaration); //Das würde nicht compilierbar sein
		
		meineDeklaration = meineIntegerVariable;
		
		// Das geht nicht, weil keine Deklaration zuvor stattgefunden hat
		//meineNeueVariable = 100;
	}

}
