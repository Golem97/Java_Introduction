 public class Interval2 {
	private Point p1;
	private Point p2; 
	
	public Interval2(Point p1,Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Interval2(double a, double b, double c, double d) {
		this.p1 = new Point(a, b);
		this.p2 = new Point(c, d);
		
	} 
	
	public Interval2(Interval2 interval) {
		this.p1 = interval.getFirstPoint();
		this.p2 = interval.getSecondPoint();
	}
	
	public Point getFirstPoint() {
		return p1;
	}
	
	public Point getSecondPoint() {
		return p2;
	}
	
	public void setFirstPoint (Point p1) {
		
		this.p1=p1;

	}
	public void setSecondPoint (Point p2) {
		
		this.p2=p2;
		
	}
	public Point midPoint() {
		Point pmil = new Point(0, 0);
		pmil.setAbscisse(((p1.getAbscisse()+p2.getAbscisse())/2));
		pmil.setOrdonne(((p1.getOrdonne()+p2.getOrdonne())/2));
		return pmil;
	}
	public double intrLength() {
		
   return Math.sqrt(Math.pow(p2.getAbscisse()-p1.getAbscisse(), 2) + Math.pow(((p2.getOrdonne())-(p1.getOrdonne())),2));
 	
	}
	
	public int compareLength(Interval2 keta) {
		if (keta.intrLength()==this.intrLength()) {
			return 0;
		}
		else return 1;
		
	}
	public boolean equals(Interval2 keta) {
		if (this.getFirstPoint().getAbscisse()==keta.getFirstPoint().getAbscisse()&&this.getFirstPoint().getOrdonne()==keta.getFirstPoint().getOrdonne()&&this.getSecondPoint().getAbscisse()==keta.getSecondPoint().getAbscisse()&&this.getSecondPoint().getOrdonne()==keta.getSecondPoint().getOrdonne()) {
			return true;
		}
		else return false;
	}
	
	
	public String toString() {
		
		return "["+this.p1+","+this.p2+"]";
		
	}
	}