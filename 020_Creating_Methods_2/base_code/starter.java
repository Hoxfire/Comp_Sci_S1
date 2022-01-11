import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int e)
	{
		for (int i=1; i<e; i++)
		{
			x*=x;
		}
		return x;
	} 
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your base number?");
		int x = sc.nextInt();
		System.out.println("What is your exponent number?");
		int e = sc.nextInt();
		System.out.println("Your answer is: "+pow(x,e));
	}
}
