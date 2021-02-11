
public class Question8 {

	public static void main(String[] args) {
		
		MyConsole consl =new MyConsole();

		int n;

		n = consl.readInt("Enter a number ");
		
		
		
		System.out.println(n);
		int res= n%10+(n%100)/10+(n%1000)/100+(n%10000)/1000;
		
	    
		System.out.println(res);
		


	}
	
	
	
	



}
