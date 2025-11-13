package SkillBuilders;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		Student stA = new Student();
		
		System.out.println(stA.getFirstName());
		stA.setFirstName("AAA");
		System.out.println(stA.getFirstName());
		stA.setstuID(698752);
		System.out.println(stA.getStudentID());
	}

}
