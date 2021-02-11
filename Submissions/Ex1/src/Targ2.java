public class Targ2{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n2;
        boolean res2 = true; 
		int num2 =0;
		int mod2 =1;
		int sum2=0;
		int trans2 ;

		n2=consl.readInt("Enter a number : ");

		int tran2 =n2;

		while (tran2>9) {
			tran2=tran2/10;
			num2++;

		}
		num2++;



		for (int i = 0; i <num2; i++) {

			mod2=mod2*10;

			trans2=n2%mod2;


			while (trans2>10) {
				trans2=trans2/10;


			}
			sum2=sum2+(trans2*trans2);

			
			

		}
		

		
		while(sum2>9) {
			
			
			if (sum2==100) {
				sum2=sum2/10;
				}
			
			sum2=((sum2%10)*(sum2%10))+((sum2/10)*(sum2/10));
			
			
		
			
		} 	
			
			if (sum2==1) {
				res2=true;
			
			}
			else {
				res2=false;
			}
			
			System.out.println(res2);
	

	
		


}
		

	}








