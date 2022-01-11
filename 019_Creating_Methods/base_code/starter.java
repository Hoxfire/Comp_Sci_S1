import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String sentence)
	{
		System.out.println(sentence);
	}
	public static void toStringCombine(String sentence)
	{
		System.out.println(sentence+" "+sentence);
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Write a sentence!");
		String s1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String s2 = sc.nextLine();
		System.out.println("This is using the methods!");
		toString(s1);
		toStringCombine(s2);
	}
}
