import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		int ans1;
		double ans2,ans3,a,b,ans4;
		a = Math.pow(2,14%3);
		b = Math.sqrt(2*6);
		ans1 = Math.max(13-6*11,30%7*(-2));
		ans2 = Math.sqrt(3*8+31%7);
		ans3 = Math.pow(37/3, 35%21);
		ans4 = Math.max(a, b);
		System.out.println("Maximum = "+ans1);
		System.out.println("Square root = "+ans2);
		System.out.println("Power = "+ans3);
		System.out.println("Max = "+ans4);
	}
}
