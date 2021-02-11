public class Question8{


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
	mi=m;
	
}
else {
	mi=n;
}
	if (m>p) {
		min=p;
	}
	else {
		min=m;
	}
	if (mi<min) {
		min=mi;
		
	}
	
	System.out.println("The minimum is "+min);

			}
		




}