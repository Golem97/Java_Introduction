
public class Question2{
	
	
	public static void main (String []args) {
		
		
	System.out.println(chaineSymmetry("zabbaz"));
	}

	
	public static boolean chaineSymmetry(String chaine) {
		
		int counter=0;
		
		int j = chaine.length()/2+1;
		for (int i = 0; i < chaine.length()/2; i++,j--) {
		

    if(chaine.charAt(i)==chaine.charAt(j)) {counter++;}
		}
		if(counter==chaine.length()/2) {return true;}
		
		else
		return false;
		
    	
	

	
    }}