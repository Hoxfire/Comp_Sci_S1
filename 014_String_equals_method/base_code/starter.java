import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
			System.out.println("misspelled or just dumb");
		}
	}
}
