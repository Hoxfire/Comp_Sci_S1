import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) 
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int c=0;
		int c2=0;
		int t = rand.nextInt(10)+1;
		int[] x;
		int[] y;
		x = new int[20];
		y= new int[21];
		//System.out.println("These are the 20 numbers");
		System.out.println("-----------------------------------------------");
		while(c < x.length)
		{
			x[c]=rand.nextInt(10)+1;
			y[c]=x[c];
			System.out.print(x[c]+" ");
			
			//if (c==9)break;
			c++;
		}
		System.out.println(" ");
		System.out.println("-----------------------------------------------");
		System.out.println("the target is: "+t);
		c=0;
		while(c < x.length)
		{
			if (x[c]==t)
			{
				System.out.println("duplacate of target at index: "+(c+1));
			}
			c++;
		}
		System.out.println("-----------------------------------------------");
		c=0;
		while(c < x.length)
		{
			if (x[c]==y[c+1])
			{
				System.out.print("two in a row at: "+(c+1)+" and "+(c+2));
				System.out.println(" with the number "+x[c]);
			}
			c++;
		}
		System.out.println("-----------------------------------------------");
	}
}
