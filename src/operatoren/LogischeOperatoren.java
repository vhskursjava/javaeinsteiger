package operatoren;

public class LogischeOperatoren {

	public static void main(String[] args) {
		
		//Logische Operatoren verknüpfen zwei Wahrheitswerte
		boolean wasser = true;
		boolean mehl = true;
		
		//Logisches UND
		boolean kannIchTeigMachen = wasser && mehl;
		System.out.println("Kannich Teig machen? " + kannIchTeigMachen);
		
		//Wahrheitstabelle UND
		System.out.println("Wahrheitstabelle UND: ");
		System.out.println("true && true = " + (true && true));
		System.out.println("false && true = " + (false && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && false = " + (false && false));
		
		//Wahrheitstabelle ODER
		System.out.println("Wahrheitstabelle ODER: ");
		System.out.println("true || true = " + (true || true));
		System.out.println("false || true = " + (false || true));
		System.out.println("true || false = " + (true || false));
		System.out.println("false || false = " + (false || false));
		
		//Wahrheitstabelle Nicht (Negation)
		System.out.println("Wahrheitstabelle NOT: ");
		System.out.println("!true = " + (!true));
		System.out.println("!false = " + (!false));
		
		//Wahrheitstabelle Exklusives ODER (XOR)
		System.out.println("Wahrheitstabelle XOR: ");
		System.out.println("true != true = " + (true != true));
		System.out.println("false != true = " + (false != true));
		System.out.println("true != false = " + (true != false));
		System.out.println("false != false = " + (false != false));
	}

}
