
public class Question3 {
	

	public static void main(String[] args) {
		
		System.out.println(gcd(85,8));

	}
	
	public static int gcd(int x,int y) {
		int trans=0;
		if (y>x) {trans=x;
	x=y;
	y=trans;}
		
	if(x==y) {
		System.out.print("The GCD is ");
		return x;
	}
	x=x-y;
	
		return gcd(x,y);
	}
	


}
