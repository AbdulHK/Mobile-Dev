package ie.dit;

public class Control 
{
	public static void main(String[]args)
	{
		double test;
		Square s1=new Square (3,5);
		
		test=s1.area(6,4);
		System.out.println(test);
		
		 Circle c1=new Circle(6);
		 test=c1.area(5);
		 System.out.println(test);
		 
		 Sphere sp1=new Sphere(5);
		 test=sp1.Volume(5);
		 System.out.println(test);
		 
		 test=sp1.surfaceArea(5);
		 System.out.println(test);

		 
		 
	}

}
