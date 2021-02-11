
public class Q6{

	public static void main(String[] args) {
		
	
		System.out.println(fibonacci(5));	
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
