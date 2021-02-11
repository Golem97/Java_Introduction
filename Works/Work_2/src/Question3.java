public class Question3{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
	
		int num =0;

		n=consl.readInt("Enter a number : ");
      
	
	while (n>10) {
	  n=n/10;
		num++;
		
	}
	num++;
			
			System.out.println("La somme est :"+num );
			
		

	}
}
