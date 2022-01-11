import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int r1;
		r1 = rand.nextInt(1000)+1;
		System.out.print("Pick a number between 1 - 1000: ");
		int n1 = sc.nextInt();
		if (n1==r1)
		{
			System.out.print("Your Number was the same, Hurray!!!!");
		}else if (n1<r1)
		{
			System.out.print("Your number is samller then the random number. The number was "+r1);
		}else if (n1>r1)
		{
			System.out.print("Your number is bigger then the random number. The number was "+r1);
		}
	}
}
