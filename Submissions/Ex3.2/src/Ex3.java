
public class Ex3 {
	
	
	
	public static String[] sentence(String s) {                                //Q1

		char[] arr = new char[s.length()];
		String[] returned = new String[How_Many_Word(s)];
		
		int a = 0;
		int b = 0;
		int j = 0;
 
		
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ' && arr[i] != '.' && arr[i] != ',') {
				a = i;

				while (arr[i] != ' ' && arr[i] != '.' && arr[i] != ',' && i < arr.length - 1) {
					i++;
				}

				
				if (arr[i] != ' ' && arr[i] != '.' && arr[i] != ',') {
					b = i + 1;
				} else {
					b = i;
				}
				returned[j] = (String) s.substring(a, b);
				j++;
			}
		}
		return returned;
	}

	
	
	public static int    How_Many_Word(String s) {
		
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

	
	public static int    ValueLetter(char c) {
		int counter= 1;
		
		char alpha[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','q','r','s','t','u','v','w','x','y','z'};
		
		for (int i = 0; i < alpha.length;i++) {
			
			if(alpha[i]== c) {
				
				counter=i+1;
				
			}
			
		}
		return counter ;
	}

	
	
	
	public static String[] dictionary(String s) {                               //Q2
		


		String[] returned = ChangeToMin(sentence(s)); 
		String trans  = null;
		boolean Marker = true;
	

		
		returned = RemindTwice(returned);


		for (int i = 0; i < returned.length; i++) {
			
			if (!Marker) {
				i=0;
				Marker=true;
				
			}
			
			if (i==returned.length-1) {
				continue;
			}
		
			
			for (int j = 0; j < returned[i].length() && j < returned[i+1].length() && Marker; j++) {

				

				if (  ValueLetter(returned[i].charAt(j))  <   ValueLetter((returned[i+1]).charAt(j))) {

				break;
					

				}
				
				else if ( ValueLetter(returned[i].charAt(j))  >  ValueLetter((returned[i+1]).charAt(j))) {
					trans = returned[i];
					returned[i]=returned[i+1];
					returned[i+1]=trans;
					Marker= false;
					}
				
		
			}
		}

		return  returned; 
	}
	
	

	
	public static String[] ChangeToMin (String[]s){

		for (int i = 0; i < s.length; i++) {
			s[i]=s[i].toLowerCase();
		}

		return s;
	}

	
	public static String[] RemindTwice (String[]s){
		
		int count = 0;
		int j = 0;
		
		for (int i = 0; i < s.length; i++) {
			for (int k = 0; k < s.length; k++) {
				//System.out.print(s[i]+"   "); System.out.println(s[k]);
				//System.out.println("i= "+i+" k= "+k );
				if (CompareString(s[i], s[k]) ==0 &&  i!=k) {
				
					s[i]= "";	
					count++;
				}

			}
			
		}
		String[] temp = new String[s.length-count];
		
		for (int i = 0, j1 = 0; i < s.length; i++, j1++) {
			if (s[i]!="") {
				temp[j1]=s[i];
			}
			else {
				j1--;
			}
		}	
		return temp;
	}
  
	
	public static int CompareString(String str1, String str2) {

		int l1 = str1.length();
		int l2 = str2.length();
		int lmin = Math.min(l1, l2);

		for (int i = 0; i < lmin; i++) {
			int str1_ch = (int) str1.charAt(i);
			int str2_ch = (int) str2.charAt(i);

			if (str1_ch != str2_ch) {
				return str1_ch - str2_ch;
			}
		}

		// Edge case for strings like
		// String 1="lol" and String 2="lolforlol"
		if (l1 != l2) {
			return l1 - l2;
		}

		// If none of the above conditions is true,
		// it implies both the strings are equal
		else {
			return 0;
		}
	}

	
	
	
	public static boolean sub(String s,String t) {                               //Q3
		String[] trans =null;

		String []f1 =dictionary(s);
		String []f2 =dictionary(t);




		int counter=0;
		
			for (int i = 0; i < f2.length; i++) {
				for (int j = 0; j < f1.length; j++) {
					if (CompareString(f2[i], f1[j]) == 0) {
						counter++;
						break;

					}
				}
			}

			if (counter==f2.length) 
			{
				return true;	
			}	
			else return false;
		}

	
	


		
			
	
}