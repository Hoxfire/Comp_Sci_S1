import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	int c = 0;
	
	System.out.print("Chose a number: ");
	int n1 = sc.nextInt();
	while (true)
	{
		System.out.println(n1);
		if(c==4)
		{
			break;
		}
		c++;
		n1++;
		
	}
	
	}
}
