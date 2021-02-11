public class Question7{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int x;
		int a;
		int b;
		int c;


		x=consl.readInt("Enter a number  : ");



        //Milliéme
		b= x/100;

		System.out.println("Milliéme : "+b);
		
		//Dixieme

		a=  x/10;
		a= a%10;
		System.out.println("Dixieme : " +a);
       
		//Centiéme
		
		c= x%10;
	
		System.out.println("Centiéme : "+c);
		
		

	}
}

