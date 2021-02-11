public class Question1{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int  exp=1;

		n=consl.readInt("Enter a number : ");

	for (int i = 1; i <n+1; i++) {
		exp=exp*i;
	}
		
			
			System.out.println( n+"! = "+exp);
			
		

	}
}
