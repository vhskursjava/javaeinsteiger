package methoden;

public class Methoden {

	public static void main(String[] args) {
		
		int meineZahl = 10;
		int dasQuadrat = quadrat(meineZahl);
		
		System.out.println("dasQuadrat: " + dasQuadrat);
	}
	
	public static int quadrat(int num) {
		int q = num * num;
		return q;
	}

}
