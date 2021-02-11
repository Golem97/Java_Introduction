
public class Question2 {



	public static void main(String[] args){


		System.out.println(numbrOfWord("really"));
 
	}


	static String longestworld(String chaine ) {


		return chaine;

	}


	public static int numbrOfWord(String chaine) {

       int counter =0;
       int counter2 =0;

		for (int i = 0; i < chaine.length() ; i++) {
		
			if (chaine.charAt(i)== ' ') {
				counter++;
				counter2++;
				
			}
			
		}

			int nmbre = chaine.length();
		   
		
			return counter;
		
	}
	

}
