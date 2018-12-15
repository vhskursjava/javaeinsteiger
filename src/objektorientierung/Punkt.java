package objektorientierung;

//Klasse Punkt
public class Punkt {

	//Membervariablen
	private int x;
	private int y;
	
	//Konstruktoren
	public Punkt() {
		x = 0;
		y = 0;
	}
	
	public Punkt(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//Methoden
	
	//Getter
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	//Setter
	public void setX(int xWert) {
		if(xWert >= 0) {
			this.x = xWert;
		} else {
			this.x = 0;
		}
	}
	
	public void setY(int yWert) {
		if(yWert >= 0) {
			this.y = yWert;
		} else {
			this.y = 0;
		}
	}
	
	public int Add() {
		return this.x + this.y;
	}
	
	public int Mult() {
		return this.x * this.y;
	}
}
