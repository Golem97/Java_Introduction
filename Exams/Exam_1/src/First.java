import javax.swing.text.AttributeSet.CharacterAttribute;

public class Dimanche {


	public static void main (String args[]) {

	//String bo ="fabrafffffffffcafffffffffdazzrrbra";
	//System.out.println(Most(bo));
		
		int tab1[]= {1,2,3,4,5,6,7,8,9};
		int tab2[]= {23,23,4,7,0,9,12,23};
	    
		either(tab1, tab2);

		
		
    //public static void Niven(){}

	}


	public static void Niven() {
		int sum=0;
		for (int i = 100; i <1000 ; i++) {
			{
				int j =10;


				sum=(i%j)+(i%(j*10)/j)+(i/(j*10));


				if (i%sum==0) {
					System.out.println(i+" is a NIVEN Number");

				}

			}

		}


	}


	public static char Most(String s) {

		
		int trans=0;
		int trans2=12;
		int most=0; ;

for (int i = 0; i < s.length(); i++) {
	
	   int counter=0;
     
		char chartrans= s.charAt(i);

		
		for (int j = 0; j < s.length(); j++) {

			
			if (chartrans==s.charAt(j)) {

				counter++;
			}
			
		}	
		
		if (counter>trans) {
			trans=counter;	
			
			most=i;
			
	
		}
		else {
			most=most;
		}
	
		trans2=most;
}

return s.charAt(trans2);
	}

    public static int larger_than_ave(int arr[]) {
    	
	int counter=0;
	double sum=0;
	double moyenne=0;
	
	for (int i = 0; i < arr.length; i++) {

		sum = sum+arr[i];
	
	}
	
	
	moyenne= sum/arr.length+1;
	System.out.println(moyenne);
	

for (int i = 0; i < arr.length; i++) {
	
	if (arr[i]>moyenne) {
counter++;		
	}
}

	

	
	return counter;
	
}

    
    
    
    
    public static int [] either(int[]arr1,int[] arr2) {

    	int counter =0;
    	int returned[]= new int[9];

    	for (int i = 0; i < arr1.length; i++) {
    		for (int j = 0; j < arr2.length; j++) {


    			if (arr1[i]==arr2[j]) {     

    				counter++;
    			}


    				if (counter==0) { 

    					returned[i]=arr1[i];
    				}
    				
    			else 
    				returned[i]=0;
    
    		}
    		counter=0;

    	}    	
    	System.out.println("RETURNED");
    	
    	for (int i = 0; i < returned.length; i++) {

				
				System.out.print(returned[i]+" , ");
		
			
		}
    	int counter2=returned.length;
    	
    	
    	for (int i = 0; i < returned.length; i++) {
    		
    		
			if (returned[i]==0) {
				
				counter2--;
				System.out.println(counter2);
			}
			
			
			
		
		}
    	
    	int returned2[]= new int[returned.length-2];
    	for (int i = 0; i < returned.length-2; i++) {
			if (returned[i]!=0) {
				returned2[i]=returned[i];
				
			}
		}
    	System.out.println("RETURNED 2");
    	for (int i = 0; i < returned.length; i++) {
			System.out.print(returned2[i]+" , ");
		}
    	
    	

    	return returned; 	

    } 




}
