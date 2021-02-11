
public class Question3 {
	
	
	public static void main (String []args) {
		
	int arr[][]= {{4,2,3},{1,5,3},{1,3,6}};
	System.out.println(trace(arr));
	}

	
    public static int trace(int [][] arr2) 
    {
    	
    	int sum=0;
    	
    	int j=0;
   
	
    	for (int i = 0; i < arr2.length; i++ , j++) {


                      sum=sum+arr2[i][j];				

			}


			
			
    	return sum;
	

}
    }