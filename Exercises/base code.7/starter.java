import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) 
	{
	//	Random rand = new Random();
	//	Scanner sc = new Scanner(System.in);
		int c=0;
		String[] x;
	//	int[] y;
		x = new String[12];
	//	y= new int[21];
		
		x[0]="     	            ________";
		x[1]="     	           /  | |   \\";
		x[2]="                 /'  /  |    '|";
		x[3]="   \\ /     _____/   /   /     |";
		x[4]="   @ @----/                   \\";
		x[5]="  <    __            )         |";
		x[6]="   \\_/    /      -_   )        |";
		x[7]="         /        -__)         |";
		x[8]="         |,                   ,|";
		x[9]="           \\_________________/";
		x[10]="              |           |";
		x[11]="              ^           ^";
		while (c<x.length)
		{
			System.out.println(x[c]);
			c++;
		}
		
    }
}
