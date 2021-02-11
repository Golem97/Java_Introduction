public class Question5{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int a1=1;
		int a2=2;
		int n;
		int res=1;
	
		
		n=consl.readInt("Enter a number : ");
		

		for (int i = 0; i <n-1; i++) {
		res=a1+a2;
		a1=a2;
		a2=res;
	    }
		System.out.println(res);

}
	}
