public class Question7{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int  counter=0;

		n=consl.readInt("Enter a number : ");

for (int i = n+1; i > 0; i--) {
	for (int j = i; j >1; j--) {
		System.out.print("* ");
	}
	System.out.println();		
}

			
			
		

	}
}
