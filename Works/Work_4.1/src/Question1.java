import java.lang.reflect.Array;

public class Question1{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();
		
		
		int n = 0;
		int counter=0;
		

		n = consl.readInt("Enter a number ");
			
		int arr [] = new int  [n];
		
     for (int i = 0; i < arr.length; i++) {
    	 int rand = 0 + (int)(Math.random() * ((9 - 0) + 1));
    	 
    	 arr[i]=rand;
    	 
    	 
	
}
     for (int i = 0; i < arr.length; i++) {

    	 System.out.print(" "+arr[i]);
    	 if (arr[i]==0) {
    		 counter++;
			
		}

    	
	}
	 System.out.println();
     System.out.println("There is "+counter+" Zero in the array");
	}



	}

