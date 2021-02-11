public class Targ3{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

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