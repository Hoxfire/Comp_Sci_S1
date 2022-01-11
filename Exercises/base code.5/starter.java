//import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Cat x = new Cat();
		
		System.out.println("Tell me your cats name");
		String s1 = sc.nextLine();
		System.out.println("");
		Cat y = new Cat(s1);
		x.meow();
		y.meow();
	}
	
}

class Cat
{
    String name;
    public Cat()
	{
		name="Garfield";
	}
	public Cat(String a)
	{
	    name = a;
	}
	
	public void meow()
	{
		System.out.println(name+" says moew");
	}
}