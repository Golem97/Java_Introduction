public class Question7{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
		int m;
		int trans;
		int trans2;
		int dem=1;
		int dem2=1;
		int gcd=1;

		     n=consl.readInt("Enter a number : ");
	         m=consl.readInt("Enter a number : ");
	         
	         
for (int i = 1; i < n+1; i++) {
	
	trans=n%i;
	
	
	if (trans==0) {
	
		
	dem=i;

		
	}
	for (int j = 1; j < m+1; j++) {
		
		trans2=m%j;
		
		
		if (trans2==0) {
			
		dem2=j;

		
			
		}
		
		if (dem==dem2) {
			
			gcd=dem;
			
		}
	}
	

}
System.out.println(gcd);	

	

			}
		




}
		

	