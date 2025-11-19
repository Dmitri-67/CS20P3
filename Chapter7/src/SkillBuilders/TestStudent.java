package SkillBuilders;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		Student stA = new Student();
		
		System.out.println(stA.getFirstName());
		System.out.println(stA.getlastName());
		System.out.println(stA.getStudentID());
		System.out.println(stA.getAddress());
		
		System.out.println("------------");		
		
		Student stB = new Student("Derek","Jake","63 Slate Street",123456789);
		
		/*System.out.println(stB.getFirstName());
		System.out.println(stB.getlastName());
		System.out.println(stB.getStudentID());
		System.out.println(stB.getAddress());
		*/
		
		stB.setFirstName("Omar");
		System.out.println(stB);
	}


}
