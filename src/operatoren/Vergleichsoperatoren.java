package operatoren;

public class Vergleichsoperatoren {

	public static void main(String[] args) {
		
		int a = 21;
		int b = 42;
		
		//Gleich ==
		boolean istGleich = (a == b);
		System.out.println("a == b? " + istGleich);
		
		//Ungleich !=
		boolean istUngleich = (a != b);
		System.out.println("a != b? " + istUngleich);
		
		//Kleiner <
		boolean istAKleinerB = (a < b);
		System.out.println("a < b? " + istAKleinerB);
		
		//Gr��er >
		boolean istAGroesserB = (a > b);
		System.out.println("a > b? " + istAGroesserB);
		
		//Kleiner oder gleich <=
		boolean istKleinerOderGleich = (a <= b);
		System.out.println("a <= b? " + istKleinerOderGleich);
		
		//Gr��er oder gleich >=
		boolean istGroesserOderGleich = (a >= b);
		System.out.println("a >= b? " + istGroesserOderGleich);
		
	}

}
