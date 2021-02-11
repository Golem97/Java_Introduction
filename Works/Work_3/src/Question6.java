public class Question6{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int trans;
		int sum=0;

		     n=consl.readInt("Enter a number : ");
	      
	         
	         
for (int i = 1; i < n; i++) {
	
	trans=n%i;
if (trans==0) {
	sum	=sum+i;

	
}	




}
		
if (sum==n) {
	System.out.println("MOUCHLAM");

}
else System.out.println("LO MOUCHLAM");


}
}

	