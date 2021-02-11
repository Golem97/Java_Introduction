public class Question6{


	public static void main (String []args) {

		String chaine = "rkz";

		AlphaSetOne(chaine);
	}



	
	public static String AlphaSetOne(String chaine) {
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alp.charAt(WitchPlace_One(chaine)));

		String str = "e";
	
		
		return  str;
			
		}

	public static int WitchPlace_One(String chaine) {
	
		int counter=30;
		int trans=0;
		String alp = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < chaine.length(); i++) {
			for (int j = 0; j < alp.length(); j++) {

				if (chaine.charAt(i)== alp.charAt(j)) {
					trans=j;
				}
				
			}
			if (counter>trans) {
				
				counter=trans;
			}


		}


		return counter;


	}  

    
}