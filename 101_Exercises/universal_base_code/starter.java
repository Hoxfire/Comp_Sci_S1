import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		//BaseClass test = new BaseClass();
		Ascii a1 = new Ascii();
		Ascii a2 = new Ascii("Dog","Wendell");
		Ascii a3 = new Ascii("Cactus","nick",2);
		Ascii a4 = new Ascii("Other");
		Ascii a5 = new Ascii("Monk");
		
		a4.setAscii("B)");
		
		a1.printArt();
		a2.printArt();
		a3.printArt();
		a4.printArt();
		a5.printArt();
	}
}
