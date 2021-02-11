import java.util.Arrays;
public class Q1 {
	public static void main(String[] args) {

		String test = " H ello, , World....test  f f f ..,. ok.00 7   ";
		String[] test2 = null;

		System.out.println(Arrays.deepToString(sentence(test)));
	}

	public static String[] sentence(String s) {

		char[] v = new char[s.length()];
		String[] t = new String[amountWords(s)];
		int index_a = 0;
		int index_b = 0;
		int j = 0;

		// copy string s to char array v
		for (int i = 0; i < s.length(); i++) {
			v[i] = s.charAt(i);
		}

		for (int i = 0; i < v.length; i++) {
			if (v[i] != ' ' && v[i] != '.' && v[i] != ',') {
				index_a = i;

				while (v[i] != ' ' && v[i] != '.' && v[i] != ',' && i < v.length - 1) {
					i++;
				}

				// inclure le dernier char si c'est une lettre
				if (v[i] != ' ' && v[i] != '.' && v[i] != ',') {
					index_b = i + 1;
				} else {
					index_b = i;
				}
				t[j] = (String) s.subSequence(index_a, index_b);
				j++;
			}
		}
		return t;
	}

public static int  amountWords(String s) {
		
		int n=1;
		
		s = s.replace("."," "); 
		s = s.replace(","," ");
	    s =s.trim();

	    for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)== ' '  && s.charAt(i-1)!=' ') {
				n++;
			}
		}
return n;
	}

}