
public class Intervalle_Execute {

	
	
	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
	    Point p2 = new Point(2,4);
	    
	//	System.out.println(Interval2( p1, p2));
	//	System.out.println(intrLength( p1, p2));
		midPoint( p1, p2);

	}
	
	public static int Interval2(Point p1, Point p2) {
		int result =0;

		if (p1.x==p2.x||p1.y == p2.y) {
			System.out.println("Longueur vide");

		}
		else {System.out.println("Distance");}


		return result;

	}
	
	public static double intrLength(Point p1, Point p2) {
		double res=0;
		
		
	res=	Math.sqrt(Math.pow(p1.x-p2.x, 2)+ Math.pow(p1.y-p2.y,2));
		
		return res;
	}

	public static Point midPoint(Point p1, Point p2) {
		 
		Point p3 = new Point(0,0);
		
		p3.x=(p1.x+p2.x) /2;
		p3.y=(p1.y+p2.y) /2;
		
		 System.out.println(p3.x);
		 System.out.println(p3.y);
		 return p3;
	}
	
	
}
