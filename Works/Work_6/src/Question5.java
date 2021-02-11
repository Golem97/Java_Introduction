public class Question5{
	
	
	public static void main (String []args) {
		
		
	System.out.println(numberOfFirstLetter("a nb kja j ahj ah jag"));
	}

	
	public static int numberOfFirstLetter(String chaine) {
		
		int counter=1;
		char zeub = ' ';
	
		for (int i = 0; i < chaine.length(); i++) {
		
			if(chaine.charAt(i)==zeub) 
			{counter++;}
		}
		
		return counter;
		
    	
	

	
    }} 