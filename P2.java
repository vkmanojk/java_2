package inheritance;





class circle {
	double r;
	String color;
	double a;
	
	circle(){
		r = 0.0;
		color = "null";
	}
	
	circle(double x, String y){
		r = x;
		color = y;
		a = 3.14 * r * r;
	}
	
	public void setRadius(double x) {
		r = x;
		a = 3.14 * r * r;
	}
	
	public double getRadius() {
		return r;
	}
	
	public void setColor(String x) {
		color = x;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return a;
	}
}

class cylinder extends circle{
	double h = 1.0;
	double v;
	
	cylinder(){
		h = 1.0;
		v = a * h;
	}
	
	cylinder(double x, String y, double z){
		super(x,y);
		h = z;
		v = a * h;
	}
	
	public double getHeight() {
		return h;
	}
	
	public void setHeight(double x) {
		h = x;
		v = a * h;
	}
	
	public double getVolume() {
		return v;
	}
	
}
public class P2 {
	
	public static void main(String args[]) {
		cylinder c = new cylinder(2.0,"Blue",3.0);
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(c.getHeight());
		System.out.println(c.getArea());
		System.out.println(c.getVolume());
	}

}
