public class Question3{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int p;
		int m;

		n=consl.readInt("Enter a number : ");
		m=consl.readInt("Enter a number : ");
		
		p=n;
	
	
		for (int j = 0; j < m-1; j++) {
			
			p=p*n;
			
		}
			
		System.out.println( "Pow  = "+p);
			}
		




}
		

	

