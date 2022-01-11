import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	
	//boolean
	System.out.print("Chose a number: ");
	int c = sc.nextInt();
	int n1 = c-1;
	while (true)
	{
		System.out.println(c);
		c*=n1;
		if(n1==1)
		{
			break;
		}
		n1--;
	}
	
	}
	public static boolean in(int a, int b)
	{
		a*=b;
		if (a%3==0)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
