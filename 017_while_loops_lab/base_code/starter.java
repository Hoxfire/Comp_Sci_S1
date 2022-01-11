import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	int c = 0;
	
	System.out.print("Please enter a name: ");
	String name = sc.nextLine();
	System.out.print("How many times would you like this name to be repeated? ");
	int n1 = sc.nextInt();
	while (true)
	{
		System.out.println(name);
		if(c==n1)
		{
			break;
		}
		c++;
		
	}
	
	}
}
