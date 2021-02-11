public class Targ1{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;

		int num =0;
		int mod =1;
		int sum=0;
		int tran1 ;

		n=consl.readInt("Enter a number : ");

		int tran =n;

		while (tran>10) {
			tran=tran/10;
			num++;

		}
		num++;



		for (int i = 0; i <num; i++) {

			mod=mod*10;

			tran1=n%mod;


			while (tran1>10) {
				tran1=tran1/10;


			}
			sum=sum+tran1;
			

		}
		System.out.println(sum);

		while(sum>9) {

			sum=(sum%10)+(sum/10);
			System.out.println(sum);
			
			
		}
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

			int n3;
			int tran3 ;
			int trans3 = 0;
			int num3=0;
			int mod3=1;
			boolean res3=false;
			int counter3=0;

			n3 = consl.readInt("Enter a number:");
			
			
			
			
			
			tran3=n3;
			while (tran3>10) {
				tran3=tran3/10;
				num3++;

			}
			num3++;	
			int arr[] = new int [num3];
			
			
		
		
			for (int i = 0; i <num3; i++) {
				
				trans3=n3;
				trans3=trans3%10;
				arr[i]=trans3;
				
				arr[i]=trans3;
				n3=n3/10;
		
			}
			
			
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==arr[num3-1-i]) {
				counter3++;
				
			}
		}
		
		if (counter3==num3) {
			res3=true;
			
		}
		else {res3=false;}
			
			System.out.println(res3);
		

	}








}