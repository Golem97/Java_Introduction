
public class Question4{

	public static void main(String[] args) {
		
	
		PyramidStars(5);
	}

	public static char printLine(int num) {
		
			if(num==0) {
				
				
				return ' ';
			}
	
			System.out.print("*");
		
		
		return printLine(num-1);
			
		}
		
		
	
	public static char PyramidStars(int num) {
		
		if(num==0)
			return ' ';
		
		 for (int i = num; i >= 0; i--) {
			 System.out.println( printLine(num-i));
		}
	     return ' ' ;
	}
	}
