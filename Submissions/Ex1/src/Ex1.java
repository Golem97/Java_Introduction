
	public class Ex1{


		public static void main (String[]args) {
			MyConsole consl =new MyConsole();
			
			
		//START OF THE FIRST PROGRAM// 

			int n1;
			int num1 =0;
			int mod1 =1;
			int sum=0;
			int trans1 ;

			n1=consl.readInt("Q1 : ");

			int tran =n1;

			while (tran>10) {
				tran=tran/10;
				num1++;

			}
			num1++;



			for (int i = 0; i <num1; i++) {

				mod1=mod1*10;

				trans1=n1%mod1;


				while (trans1>10) {
					trans1=trans1/10;


				}
				sum=sum+trans1;
				

			}
			System.out.println(sum);

			while(sum>9) {

				sum=(sum%10)+(sum/10);
				
			}
			System.out.println(sum);
			
			//END OF THE FIRST PROGRAM// 
			
			
			
			
			//START OF THE SECOND PROGRAM// 
			int n2;
	        boolean res2 = true; 
			int num2 =0;
			int mod2 =1;
			int sum2=0;
			int trans2 ;

			n2=consl.readInt("Q2 : ");

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
				
				//END OF THE SECOND PROGRAM// 
				
				
				//START OF THE THRIST PROGRAM// 
				
				
				int n3;
				int tran3 ;
				int trans3 = 0;
				int num3=0;
				int mod3=1;
				boolean res3=false;
				int counter3=0;

				n3 = consl.readInt("Q3 :");
				
				
				
				
				
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
				
				//END OF THE THIRST PROGRAM// 
				

				//START OF THE FOURTH PROGRAM// 
				
		        int n4;
				int winner=0;

				n4=consl.readInt("Q4: ");

				for (int i=1 ; i<=n4; i++)
				{
				winner = (winner +2)%i ;
				}

				System.out.println(winner+1);
				
				
				//END OF THE FOURTH PROGRAM// 
			
		}
		








	}
	


