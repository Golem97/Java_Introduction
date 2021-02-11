public class Question5{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		double x,y;

		
		x=consl.readDouble("Enter a number : ");
		
		
		int a;
		
		a=(int)x;
	
		y= x-a;
		
		 System.out.println("x = "+x);
		 System.out.println("a = "+a);
		 System.out.println("Diff = "+y*1000);
		
		
		 
	

	}
}

