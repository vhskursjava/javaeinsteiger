package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int[] meinIntArray = new int[5];
		meinIntArray[0] = 10;
		meinIntArray[1] = 20;
		meinIntArray[2] = 50;
		meinIntArray[3] = 100;
		meinIntArray[4] = 200;
		
		System.out.println("meinIntArray am Index 2: " + meinIntArray[2]);
		
		System.out.println("-- Array ausgeben --");
		for(int i = 0; i < meinIntArray.length; i++) {
			System.out.println(meinIntArray[i]);
		}
		
		//Gesamtes Array mit 0 initialisieren
		for(int i = 0; i < meinIntArray.length; i++) {
			meinIntArray[i] = 0;
		}
		
		System.out.println("-- Array erneut ausgeben --");
		for(int i = 0; i < meinIntArray.length; i++) {
			System.out.println(meinIntArray[i]);
		}
		
		char[] charArray = new char[] { 'a', 'b', 'c', 'Z' };
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.println("charArray an der Stelle " + i + " ist " + charArray[i]);
		}
		
	}

}
