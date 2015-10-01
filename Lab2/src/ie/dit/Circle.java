package ie.dit;

public class Circle extends Shape
{
	 public static double Pi=3.14;
	private  double radius;
	 
	
	public static double getPi() {
		return Pi;
	}
	public static void setPi(double pi) {
		Pi = pi;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public int area(double radius)
	{
		area= Pi *radius *radius;
		return 0;
		
	}
}
