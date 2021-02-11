public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	} 
	
	public Point(Point p) {
		this.x = p.getAbscisse();
		this.y = p.getOrdonne();
	}
	
	
	public double getAbscisse() {
		return this.x;
	}
	
	public double getOrdonne() {
		return this.y;
	}
	public void setAbscisse(double x) {
		this.x = x;
	}
	public void setOrdonne(double y) {
		this.y = y;
	}
	
	public String toString() {
		
		return "("+this.x+","+this.y+")";
		
	}

	}