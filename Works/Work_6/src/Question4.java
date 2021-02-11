public class Question4{
	
	
	public static void main (String []args) {
		
		
	System.out.println(numberOfFirstLetter("nnbkjajahjahjag"));
	}

	
	public static int numberOfFirstLetter(String chaine) {
		
		int counter=0;
		
	
		for (int i = 0; i < chaine.length(); i++) {
		
			if(chaine.charAt(i)==chaine.charAt(0)) 
			{counter++;}
		}
		
		return counter;
		
    	
	

	
    }} 