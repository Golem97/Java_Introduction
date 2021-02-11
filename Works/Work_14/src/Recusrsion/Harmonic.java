
public class Recursivité{

	public static void main(String[] args) {
		System.out.println(harmonic(6));
		System.out.println(fibonacci(5));	
	}


	public static double harmonic(double n) {
		if(n==0) {
			throw new IllegalArgumentException("Impossible");
		}
		
		if(n==1) {
			return 1;}
		
	
		return (harmonic(n-1)+(1/n));

}
	
	public static int fibonacci(int num) {
		
		if(num==0) {
			return 0 ;
		}
		
		if(num==1||num==2) {
			
			return 1;
		}
		
		
		
		else
		return fibonacci(num-2)+fibonacci(num-1);
		

	}
	  
	}
