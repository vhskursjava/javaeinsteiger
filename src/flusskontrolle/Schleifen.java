package flusskontrolle;

public class Schleifen {

	public static void main(String[] args) {
		
//		while(<Abbruchbedingung>) {
//			Schleifenrumpf wird solange wiederholt,
//		    bis die Bedingung false ergibt.
//		}
		
		System.out.println("Vor der Schleife...");
		int index = -1;
		while(index >= -10) {
			System.out.println("Index ist: " + index);
			index--; //index = index - 1;
		}
		//System.out.println("Nach der Schleife...");
		
		//For-Schleife
		//for(<Variablen erstellen>;<Abbruchbedingung>;<Increment>) {
		//
		//}
		
		//1. Variable i wird definiert (nur ein einziges Mal!)
		//2. Abbruchbedingung wird geprüft (vor jedem Schleifendurchlauf)
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		} //3. i wird um eins inkrementiert (nach jedem Schleifendurchlauf)
		
		//Zahlen von 1 - 100 addieren (mit einer for-Schleife)
		int counter = 0;
		for(int i = 1; i <= 100; i++) {
			counter += i;
		}
		System.out.println("Ergebnis 1 - 100: " + counter);
		
		//Schleifenbeispiele mit Strings
		String meinString = "Hallo, ich programmiere in Java!";
//		System.out.println("meinString an der Stelle 0 ist: " + meinString.charAt(0));
//		System.out.println("meinString an der Stelle 9 ist: " + meinString.charAt(9));
//		System.out.println("meinString an der Stelle 9 ist: " + meinString.charAt(100)); //Fehler zur Laufzeit; Index existiert nicht
		
		for(int i = 0; i < meinString.length(); i++) {
			System.out.println(meinString.charAt(i));
		}
		
		//Gebe nur die i's in meinString aus
		for(int i = 0; i < meinString.length(); i++) {
			if(meinString.charAt(i) == 'i') {
				System.out.println("An der Stelle " + i + " ist ein i");
			}
		}
		
		//Zähle alle a's e's (klein)
		int aZaehler = 0;
		int eZaehler = 0;
		for(int i = 0; i < meinString.length(); i++) {
			if(meinString.charAt(i) == 'a') {
				aZaehler = aZaehler + 1; //Zähle aZaehler ums eins hoch
			} else if (meinString.charAt(i) == 'e') {
				eZaehler++;
			}
		}
		System.out.println("Ich habe " + aZaehler + " a's gefunden");
		System.out.println("Ich habe " + eZaehler + " e's gefunden");
		System.out.println("Das sind insgesamt " + (aZaehler + eZaehler) + " Buchstaben");
	}

}
