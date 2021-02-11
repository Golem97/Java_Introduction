public class Question9{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int m;
		int p;
		int min;
		int mi;
		
	

		     n=consl.readInt("Enter a number : ");
	         m=consl.readInt("Enter a number : ");
	         p=consl.readInt("Enter a number : ");
	         
if (n>m) {
	mi=n;
	
}
else {
	mi=m;
}
	if (m>p) {
		min=m;
	}
	else {
		min=p;
	}
	if (mi<min) {
		
		min=min;
		
	}
	else
		min=mi;
	
	System.out.println("The maximum is "+min);

			}
		




}