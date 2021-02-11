public class Question2{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int a;
		int sum =0;

		a=consl.readInt("Enter a number : ");

	
		
		
			for (int i = 0; i < a+1; i++) {
				
				sum= sum+i;
			}
			
			
			System.out.println("La somme est :"+sum );
			
		

	}
}
