package objektorientierung;

public class OOPTest {

	public static void main(String[] args) {
		 Punkt p = new Punkt();
		 
		 p.setX(100);
		 p.setY(200);
		 
		 System.out.println("X: " + p.getX());
		 System.out.println("Y: " + p.getY());
		 System.out.println("Add: " + p.Add());
		 System.out.println("Mult: " + p.Mult());
		 
		 p.setX(5);
		 p.setY(10);
		 
		 System.out.println("X: " + p.getX());
		 System.out.println("Y: " + p.getY());
		 System.out.println("Add: " + p.Add());
		 System.out.println("Mult: " + p.Mult());
		 
		 Punkt p2 = new Punkt();
		 p.setX(9);
		 p.setY(8);
		 
		 System.out.println("p2 X: " + p2.getX());
		 System.out.println("p2 Y: " + p2.getY());
		 System.out.println("p X: " + p.getX());
		 System.out.println("p Y: " + p.getY());
		 
		 Punkt p3 = new Punkt(10, 12);
		 System.out.println("p3 x: " + p3.getX());
		 System.out.println("p3 y: " + p3.getY());
	}

}
