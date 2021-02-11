public class Question7{


	public static void main (String []args) {

		String chaine = "jikl";


		System.out.print(FinalPart(chaine));



	}

	public static String PartTwo(String chaine) {



		System.out.println(	chaine.substring(1, chaine.length()));


		String str = " ";


		return  str;

	}

	public static int WitchPlace_One(String chaine) {


		String alp = "abcdefghijklmnopqrstuvwxyz";
		int trans=0;

		for (int i = 0; i < alp.length(); i++) {
			if ( alp.charAt(i)==chaine.charAt(0)) {
				trans=i;
			}
		}

		return trans;
	}

	public static char PartOne(String chaine) {
		String alpMaj = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


		char first = alpMaj.charAt(WitchPlace_One(chaine));

		return first;
	}

	public static String FinalPart(String chaine) {
		System.out.print(PartOne(chaine));

		return PartTwo(chaine);


	}

}

