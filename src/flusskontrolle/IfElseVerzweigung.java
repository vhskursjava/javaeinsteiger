package flusskontrolle;

public class IfElseVerzweigung {

	public static void main(String[] args) {

//		if(<Bedingung>) {
//			Das wird nur ausgeführt, wenn die Bedingung true ist
//		} else {
//			Das wird nur ausgeführt, wenn die Bedingung false ist
//		}
//		else ist dabei optional

		int note = 4;
		if ((note == 1) || (note == 2) || (note == 3)) {
			System.out.println("Das hast du super gemacht!");
		} else {
			System.out.println("Du musst dich mehr anstrengen!");
		}

		if (note >= 1 && note <= 3) {
			System.out.println("Das hast du super gemacht!");
		} else {
			System.out.println("Du musst dich mehr anstrengen!");
		}

	}

}
