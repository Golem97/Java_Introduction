
public class Question4 {
	

	public static void main(String[] args) {
		
		System.out.println(GcdEuclid(40,4));

	}
	
	public static int rest(int x,int y) 
	{	int trans=0;
	    int rest =0 ;
		
		if (y>x) {trans=x;
	x=y;
	y=trans;}
	
		rest = x/y;
		rest = x -(rest*y);
		
		return rest;
	}
	public static int Quo(int x,int y) 
	{	int trans=0;
	    int rest =0 ;
		
		if (y>x) {trans=x;
	x=y;
	y=trans;}
	
		rest = x/y;
		
		
		return rest;
	}
    public static int GcdEuclid(int x,int y) {
    	int rest=0;
    	int quotien=0;
    	int sol=0;
    
    	rest=rest(x,y);
        quotien=Quo(x,y);
        
       while(rest!=0) {
    	   
    	x=quotien;
    	y=rest;

    	sol=rest(x,y);
       } 	
    
    	
    	
    	return sol;
    }
}
