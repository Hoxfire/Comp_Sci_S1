import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int points = 25;
		System.out.println("Whats your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String p = sc.nextLine();
		if (p.equals("Wizard") || p.equals("wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}else if (p.equals("Warrior") || p.equals("warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}else if (p.equals("Rogue") || p.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}else{
			System.out.println("misspelled or just dumb. restart");
		}
		System.out.println("You have 25 skill points to spend in the following:\nStrength, Dexterity, Intelligence, Constitution, and Charisma.\nSpend them wisely.");
		System.out.println("Strength (1-10)");
		int Strength = sc.nextInt();
		if (stat >= 11) 
		{
			System.out.println("Thats to much");
			points-=10;
			System.out.println("You have "+points+" left");	
		}
		else if (points==0)
		{
			System.out.println("You have no points left");
			points=0;
		}
		else
		{
			points-=stat;
			System.out.println("You have "+points+" left");	
		}
		System.out.println("Dexterity (1-10)");
		int Dexterity = sc.nextInt();
		if (stat >= 11) 
		{
			System.out.println("Thats to much");
			points-=10;
			System.out.println("You have "+points+" left");	
		}
		else if (points==0)
		{
			System.out.println("You have no points left");
			points=0;
		}
		else
		{
			points-=stat;
			System.out.println("You have "+points+" left");	
		}
		System.out.println("Intelligence (1-10)");
		int Intelligence = sc.nextInt();
		if (stat >= 11) 
		{
			System.out.println("Thats to much");
			points-=10;
			System.out.println("You have "+points+" left");	
		}
		else if (points==0)
		{
			System.out.println("You have no points left");
			points=0;
		}
		else
		{
			points-=stat;
			System.out.println("You have "+points+" left");	
		}
		System.out.println("Constitution (1-10)");
		int Constitution = sc.nextInt();
		if (stat >= 11) 
		{
			System.out.println("Thats to much");
			points-=10;
			System.out.println("You have "+points+" left");	
		}
		else if (points==0)
		{
			System.out.println("You have no points left");
			points=0;
		}
		else
		{
			points-=stat;
			System.out.println("You have "+points+" left");	
		}
		System.out.println("Charisma (1-10)");
		int Charisma = sc.nextInt();
		if (stat >= 11) 
		{
			System.out.println("Thats to much");
			points-=10;
			System.out.println("You have "+points+" left");	
		}
		else if (points==0)
		{
			System.out.println("You have no points left");
			points=0;
		}
		else
		{
			points-=stat;
			System.out.println("You have "+points+" left");	
		}
		System.out.println("You are");
	}
}
