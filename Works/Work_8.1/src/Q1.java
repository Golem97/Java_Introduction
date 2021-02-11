
public class Q1 {

	public static void main(String[] args) {
		System.out.println(fact(6));
	}
	
	
	
	
	public static int fact (int n) {
		if (n==1) {
			return 1;
		}
		
		int z = n*fact(n-1);
	
		return z;
	
	
	}
}
