
public class Question4 {
	
	
	public static void main (String []args) {
		
	int arr[][]= {{4,2,3},{1,5,3},{1,3,6}};
	System.out.println(trace2(arr));
	}

	
    public static int trace2(int [][] arr2) 
    {
    	
    	int sum=0;
    	
    	int j= 0;
   
	
    	for (int i = arr2.length-1; i >=0 ; i--) {



                      sum=sum+arr2[i][j];
				
                        j++;
			}
 

			
			
    	return sum;
	

}
    }