package ie.dit;

public class Square extends Shape
{
	private int width;
	 private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Square(int height,int width)
	{
		this.width=width;
		this.height=height;
	}
	public double area(int height,int width)
	{
		area= width*height;
		return area;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", height=" + height + "]";
	}
}
