package miniaufgaben;

public class MiniAufgabe3 {

	public static void main(String[] args) {
		
		int note = 1;
		//wenn die note 1 ist dann
		//oder wenn die note 2 ist
		
		String notenString = "";
		if(note == 1) {
			notenString = "Sehr gut";
		} else if (note == 2) {
			notenString = "Gut";
		} else if (note == 3) {
			notenString = "Befriedigend";
		} else if (note == 4) {
			notenString = "Ausreichend";
		} else if (note == 5) {
			notenString = "Mangelhaft";
		} else if (note == 6) {
			notenString = "Ungenügend";
		} else {
			notenString = "Das ist keine valide Note!";
		}
		System.out.println("Note " + note + " ist " + notenString);
	}

}
