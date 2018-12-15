package objektorientierung;

public class ReferenzDatentypen {

	public static void main(String[] args) {
		
		//Werttypen/Primitive Datentypen
		int werttyp1 = 10;
		int werttyp2 = 100;
		int werttyp3 = werttyp1;
		
		werttyp1 = 42;
		
		System.out.println("werttyp1: " + werttyp1);
		System.out.println("werttyp2: " + werttyp2);
		System.out.println("werttyp3: " + werttyp3);
		
		//Referenztypen
		Punkt ref1 = new Punkt();
		ref1.setX(1);
		ref1.setY(2);
		Punkt ref2 = new Punkt();
		ref2.setX(3);
		ref2.setY(4);
		Punkt ref3 = ref1;
		
		ref1.setX(100);
		ref1.setY(200);
		
		System.out.println("ref1: " + ref1.getX() + " : " + ref1.getY());
		System.out.println("ref2: " + ref2.getX() + " : " + ref2.getY());
		System.out.println("ref3: " + ref3.getX() + " : " + ref3.getY());
		
		//Null
		Punkt ref4 = null;
		System.out.println(ref4.getX());
		//int wt4 = null; //Funktioniert nur bei Referenztypen
	}

}
