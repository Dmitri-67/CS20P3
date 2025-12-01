package SkillBuilders;

public class TestCircle {

public static void main(String[] args)
{
	Circle spot = new Circle(2.5);
	Circle chhs = new Circle(1.7);
	
	if(spot.getRadius()== chhs.getRadius())
	{
		System.out.println("Objects are equal");
	}
	else 
	{
		System.out.println("Objects are not equal");
	}
	System.out.println("Circle radius: " + spot.getRadius());
	System.out.println("Circle circumference: " + spot.circumference());
}	
	
//Review: Coin – part 1 of 2//
	
}