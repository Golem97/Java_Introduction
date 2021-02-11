public class Question2{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int  counter=0;

		n=consl.readInt("Enter a number : ");

for (int i = 0; i < n; i++) {
	for (int j = 0; j < i+1; j++) {
		System.out.print("* ");
	}
	System.out.println();		
}

			
			
		

	}
}
