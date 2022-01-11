import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) 
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int c=0;
		int c2=19;
		int[] x;
		int[] y;
		x = new int[20];
		y = new int[20];
		System.out.println("These are the 20 numbers");
		while(true)
		{
			x[c]=rand.nextInt(50)+1;
			System.out.print(x[c]+" ");
			if (c==19)break;
			c++;
		}
		System.out.println(" ");
		System.out.println("These are those numbers backwards");
		while(c==19)
		{
			y[c2]=x[c2];
			System.out.print(y[c2]+" ");
			if (c2==0)break;
			c2--;
		}
	}
}
