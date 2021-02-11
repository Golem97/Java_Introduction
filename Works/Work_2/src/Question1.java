import java.util.Random;
public class Question1 {


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		double a,b,x;

		a=consl.readDouble("Enter a number : ");

		b=consl.readDouble("Enter a number : ");
		
		 System.out.println("a = "+a); 
		 System.out.println("b = "+b);
	x=a/b;
	
	System.out.println(x);

	}
}
