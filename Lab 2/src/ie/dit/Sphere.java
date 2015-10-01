package ie.dit;

public class Sphere implements ThreeDShape
{
	private double volume;
	private double SurfaceArea;
	private double Pi=3.14;
	public int radius;
	
	public Sphere(int radius){
		this.radius=radius;
	}
	public double Volume(int radius)
	{
		volume = (4/3) *Pi * radius * radius * radius;
		return volume;
	}
	public double surfaceArea(int radius) {
		SurfaceArea= 4 * Pi * radius * radius;
		return SurfaceArea;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getSurfaceArea() {
		return SurfaceArea;
	}
	public void setSurfaceArea(double surfaceArea) {
		SurfaceArea = surfaceArea;
	}
	public double getPi() {
		return Pi;
	}
	public void setPi(double pi) {
		Pi = pi;
	}

}
