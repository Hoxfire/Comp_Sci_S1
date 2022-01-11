import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int r1,r2,r0,r3,r4;
		double d1,d2,d3,d4;
		r1 = rand.nextInt(10);
		r0 = rand.nextInt(100);
		r2 = r0+1;
		d1 = rand.nextDouble();
		d2 = rand.nextDouble();
		r3 = rand.nextInt(3)+1;
		r4 = rand.nextInt(590)-14;
		System.out.println(r1+" "+r2+" "+(r3+d1)+" "+(r4+d2));
	}
}
