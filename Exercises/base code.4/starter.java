import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Choose a number: ");
		int n1 = sc.nextInt();
		
	}
	public static boolean checkPrime(int a){
		int c=0;
		int b=a-1;
		while (true)
		{
			//System.out.println(a);
			if(a%b != 0)
			{
				return true;
			}
			
			c++;
			a--;
			 
		}
	}
	public static void printPrimes(int n2)
	{
		if (checkPrime(n2)==true) 
		{
			System.out.println("your number is prime");
		}else
		{
			System.out.println("your number is not prime");
		}
	}
}
