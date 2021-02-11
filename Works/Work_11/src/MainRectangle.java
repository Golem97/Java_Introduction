import javax.swing.plaf.synth.SynthSeparatorUI;

public class MainRectangle {

	public static void main(String[] args) {
		
		Rectangle rec=  new  Rectangle(4,5) ;
		Rectangle rec2= new  Rectangle(2,13) ;
		Rectangle rec3= new  Rectangle(3,4) ;
		Rectangle rec4= new  Rectangle(4,65) ;
		Rectangle rec5= new  Rectangle(54,4) ;
		Rectangle rec6= new  Rectangle(3,8) ;
		
		
	Rectangle rectArr[]= {rec,rec2,rec3,rec4,rec5,rec6};
	

		
		System.out.println(rec.toString());
		System.out.println();
		System.out.println("PERIMETRE    "+rec.perimeter());
		System.out.println();
		System.out.println("AIR  "+rec.area());
		System.out.println();
		System.out.println("MEME OU PAS : O [Same]   1 [differents]    =  "+rec.compare(rec2));
		System.out.println();
	
		 sort(rectArr);
	for (int i = 0; i < rectArr.length; i++) {
			System.out.println(rectArr[i].toString()+", AIR "+rectArr[i].area());
		
	}
		
	}
		

public static void sort(Rectangle[] rectArr) {
	
	Rectangle temp = new Rectangle(0,0);
	
	for (int i = 0; i < rectArr.length; i++) {
		for (int j = 0; j < rectArr.length; j++) {
			
			if (rectArr[i].area()>rectArr[j].area()) {
				temp=rectArr[i];
				rectArr[i]=rectArr[j];
				rectArr[j]=temp;
			}
			
		}
	}
} 
	}