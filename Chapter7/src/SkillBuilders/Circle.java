package SkillBuilders;

public class Circle {
	private static final double PI = 3;
	private double radius;
	
	public Circle()
	{
		radius = 1;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double Area()
	{
		double circleArea;
		
		circleArea = PI * radius * radius;
		
		return circleArea;
	}
	
	public double circumference()
	{
		double c;
		
		c = 2 * PI * radius;
		
		return c;	
	}
	public static void displayFormula()
	{
		System.out.println("Six seven");
	}
	public boolean equals(Object c)
	{
		Circle testObj = (Circle)c;
		
		if(testObj.getRadius() == radius)
{
	return false;
}
	}

}
