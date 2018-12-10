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
	}

}
