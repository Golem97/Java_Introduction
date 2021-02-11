
public class Question1 {

	
	
	public static void main (String []args) {
		
	String chaine1= "Allé l'OM";
	String chaine2= "Allé l'OM";
	
	System.out.println( zeout(chaine1,chaine2));
	}

	
	public static boolean zeout( String chaine1, String chaine2) {
		int counter=0;
		
		if(chaine1.length()!=chaine2.length()) {return false;}
		else {
			
		for (int i = 0; i < chaine1.length(); i++) {
			
			if(chaine1.charAt(i)==chaine2.charAt(i))	{
				counter++;
			}
	
		}
		
	
		}
		if(counter==chaine1.length() ){
			return true;
		}
		
		else
	return false;
		}
 

			
			
    	
	


    }

