import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your first name?");
		String Name = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("What is your birth day month?(1-12)");
		int bm = sc.nextInt();
		System.out.println("What day were you born in?(1-32)");
		int bd =sc.nextInt();
		System.out.println("What year where you born in?");
		int by = sc.nextInt();
		System.out.println("How much is a buck 50?");
		int buck_50 = sc.nextInt();
		System.out.println("Hi, "+Name+"man your already"+age+". I remember you were so tiny when you were born on"+bm+bd+by);
	}
}
