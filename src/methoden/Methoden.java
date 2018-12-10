package methoden;

public class Methoden {

	public static void main(String[] args) {

//		int meineZahl = 10;
//		int dasQuadrat = quadrat(meineZahl);
//		
//		System.out.println("dasQuadrat: " + dasQuadrat);

//		int ergebnis = Rechner.addieren(100, 42);
//		System.out.println(ergebnis);
//		
//		System.out.println(Rechner.dividieren(5.0, 10.0));
//		System.out.println(Rechner.multiplizieren(21, 2));

//		System.out.println("-- Rechtecksberechnungen --");
//		double seiteA = 10.0;
//		double seiteB = 5.0;
//		System.out.println("Flächeninhalt: " + Rechteck.flaeche(seiteA, seiteB));
//		System.out.println("Umfang: " + Rechteck.umfang(seiteA, seiteB));
//		System.out.println("Diagonallänge: " + Rechteck.diagonale(seiteA, seiteB));
//		System.out.println("Umkreisradius: " + Rechteck.umkreis(seiteA, seiteB));
//		System.out.println();
//		System.out.println();

		int note = 6;
		System.out.println("Du hast die Note " 
				+ note + " bekommen. Das ist " 
				+ NotenKlasse.getNotenString(note) + "!");
	}

	public static int quadrat(int num) {
		int q = num * num;
		return q;
	}

}
