import java.util.Random;
public class Question1 {


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int a,b,trans;

		a=consl.readInt("Enter a number : ");

		b=consl.readInt("Enter a number : ");
		
		 System.out.println("a = "+a); 
		 System.out.println("b = "+b);
		 
		 trans=a;
		 a=b;
		 b=trans;
		 
		 System.out.println("Ares changement a = : "+a); 
		 System.out.println("Ares changement b = : "+b); 

	}
}
