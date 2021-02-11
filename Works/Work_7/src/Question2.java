
public class Question2 {

	public static void main(String[] args) {
		
		
		System.out.println(sum(14));

	}

	
	public static int sum(int num) {
		
		if(num==1||num==0) {
			return 1;
		}
		
		return num+sum(num-1);
		
	}
}
