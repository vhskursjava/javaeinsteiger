package methoden;

public class NotenKlasse {

	public static String getNotenString(int note) {
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
			notenString = "";
		}
		return notenString;
	}
}
