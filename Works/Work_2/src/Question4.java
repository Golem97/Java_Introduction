public class Question4{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int n;
	
		int num =0;
		int zer=0;
		int counter=0;
		
		int ten=1;

		n=consl.readInt("Enter a number : ");
		
      int tran =n;
	
	while (tran>10) {
	 tran=tran/10;
		num++;
		
	}
	num++;
			
			System.out.println("There is "+num+" numbers" );
			
			
			int div=1;
		
			for (int i = 10; i < n*10; i=i*10) {

					zer=n%i;
					
									
						zer=zer/div;
						
						
					
					div=div*10;
					
					
		                   	if(zer==0)
		                    	{
		                     		counter++;
	                       		}
			
			
			
			}System.out.println("There is "+counter+" zero in the number ");
			

	}
	
	
	
	
	
	
	
	
}
