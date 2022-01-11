import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int v1;
		int v2;
		System.out.print("Please put in the first number: ");
		v1 = sc.nextInt();
		System.out.println("");
		System.out.print("Please put in the second number: ");
		v2 = sc.nextInt();
		System.out.println("");
		//System.out.println("the first variable is: "+v1);
		//System.out.println("the second variable is: "+v2);

		if (v1==v2)
		{
			System.out.println("The variables are the same");
		}
		else
		{
			System.out.println("the variables are different");	
		}
	}
}
