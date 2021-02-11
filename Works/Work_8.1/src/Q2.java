
public class Q2 {

	public static void main(String[] args) {
		System.out.println(sum(6));
	}
	
	
	
	
	public static int sum (int n) {
		if (n==1) {
			return 1;
		}
		
		int z = n+sum(n-1);
	
		return z;
	
	
	}
}
