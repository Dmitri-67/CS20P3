package SkillBuilders;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public Student()//Constructor method
	{
		firstName = "Unknown";
		lastName = "Unknown";
		address = "Unknown";
		stuID = 0000000;
	}
	
	public Student(String f, String l, String ad, int ID)//Overload constructor
	{
		firstName = f;
		lastName = l;
		address = ad;
		stuID = ID;
	}
	
	//Accessor methods
	public String getFirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getAddress()
	{
		return address;
	}
	public int getStudentID()
	{
		return stuID;
	}
	//Modifier methods
	public void setFirstName(String f)
	{
		firstName = f;
	}
	public void setlastName(String l)
	{
		lastName = l;
	}
	public void setAddress(String a)
	{
		address = a;
	}
	public void setstuID(int s)
	{
		stuID = s;
	}
	
	public String toString()
	{
		return ("First name: "+ firstName + "Last name: "+ lastName + "/nAddress: "+ address + "/nStudent ID: "+ stuID);
	}
	


}//Closes the class
