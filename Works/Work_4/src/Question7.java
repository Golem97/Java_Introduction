
public class Question7 {


	public static void main(String[] args) {
		MyConsole consl =new MyConsole();

		int n,m,p ;

		n = consl.readInt("Enter a number ");
		m = consl.readInt("Enter a number ");
		p = consl.readInt("Enter a number ");
		
		
		System.out.println(n+" "+m+" "+p);

		int arr [] = new int  [3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=n;
			
		}
	}
	
	
	

}
