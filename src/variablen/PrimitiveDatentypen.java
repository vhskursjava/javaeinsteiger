package variablen;

public class PrimitiveDatentypen {

	public static void main(String[] args) {
		
		//Integer (Ganzzahlen) Datentyp (32Bit)
		int IntegerDatentyp; 
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		System.out.println("maxInt: " + maxInt);
		System.out.println("minInt: " + minInt);
		
		//Long (Ganzzahl) Datentyp (64Bit)
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		System.out.println("maxLong: " + maxLong);
		System.out.println("minLong: " + minLong);
		
		//Byte (Ganzzahl) (8Bit)
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		
		System.out.println("maxByte: " + maxByte);
		System.out.println("minByte: " + minByte);
		
		//Short (Ganzzahl) (16Bit)
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		System.out.println("maxShort: " + maxShort);
		System.out.println("minShort: " + minShort);
		
		//Was passiert bei Werten auﬂerhalb der entsprechenden Wertebereiche
		int Overflow = Integer.MAX_VALUE + 1;
		int Underflow = Integer.MIN_VALUE - 1;
		
		System.out.println("Overflow: " + Overflow);
		System.out.println("Underflow: " + Underflow);
		
		//Wahrheitswerte
		boolean meinBoolean1 = true;
		boolean meinBoolean2 = false;
		
		System.out.println("meinBoolean1: " + meinBoolean1);
		System.out.println("meinBoolean2: " + meinBoolean2);
		
		//Das geht nicht, da Wahrheitstyp
		//meinBoolean1 = 100;
		
		//Gleitkommazahlen
		
		//Float (Gleitkommazahl) (32Bit) Genauigkeit etwa 7 Stellen
		float meinFloat = 1.5f;
		
		//Double (Gleitkommazahl) (64Bit) Genauigkeit etwa 15 Stellen
		double meinDouble = -1.5;
		
		//Zeichendatentyp (character) (16Bit)
		char meinChar = 'A';
		
		System.out.println("meinChar: " + meinChar);
		
		char meinChar2 = 67;
		System.out.println("meinChar2: " + meinChar2);
		
		//Zeichenkettendatentyp
		String s = "Hallo ich bin ein \"String\"!";
		String stringMitNewline = "Das ist eine\t Zeile\nDas ist die n‰chste Zeile\nDas ist ein Backslash \\";
		String meinPfad = "C:\\Benutzer\\vhs\\meineDatei.txt";
		
		
		System.out.println(s);
		System.out.println(stringMitNewline);
		System.out.println(meinPfad);
		System.out.println(s + meinPfad);
		
		//String-Konkatenation
		String gruss = "Hallo, ";
		String userName = "Marvin";
		int alter = 28;
		
		String kompletterGruss = gruss + userName + "!\nDu bist " + alter + " Jahre alt.";
		System.out.println(kompletterGruss);
		
	}

}
