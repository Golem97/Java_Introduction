import java.util.Scanner ;
import java.util.Random ;

       public class targ1{
    	   
    	   public static void main(String[] args) {
    	
    		   MyConsole consl =new MyConsole();
    	
    		   
    		   int n, m ;
    		   
    		   
    		   n = consl.readInt("Enter matrices width size:");
    		   m = consl.readInt("Enter matrices length size:");
    		   
    		   int m1 [][] = new int  [n][m];
    		   int m2 [][] = new int  [n][m];
    		   int m3 [][] = new int  [n][m];
    		   
    		   
    	
  
    		
    		   System.out.println(); System.out.println("Matrice A");  System.out.println();
    		   
    		   for (int i = 0; i < m1.length; i++) {
			
    		
    		for (int j = 0; j < m1[i].length; j++) {
    			int nombreAleatoire = 10 + (int)(Math.random() * ((100 - 10) + 1));
    			m1[i][j]= nombreAleatoire ;
				System.out.print(m1[i][j]+"  ");
				
				}
  System.out.println();
    
    		   
    	   } 
    		   System.out.println();   System.out.println("Matrice B"); System.out.println();
    		
    		   
    		   for (int k = 0; k < m2.length; k++) {
    				
    			       	    		
    	    		for (int l = 0; l < m2[k].length; l++) {
    	    			int nombreAleatoires = 10 + (int)(Math.random() * ((50 - 0) + 1));
    	    			m2[k][l]= nombreAleatoires ;
    					System.out.print(m2[k][l]+"  ");
    					
    					}
    	  System.out.println();
    	    
    	    		   
    	    	   } 
    		
    		   System.out.println(); System.out.println("Matrice C = A + B "); System.out.println();
    		   for (int s = 0; s < m3.length; s++) {
			
    		
    		for (int p = 0; p < m3[s].length; p++) {
    			
    			m3[s][p]= m1[s][p]+ m2[s][p] ;
				System.out.print(m3[s][p]+"  ");
				
				}
  System.out.println();
    
    		   
    	   } 
    		   } 
    	   
       } 
    	   
    
  
	
