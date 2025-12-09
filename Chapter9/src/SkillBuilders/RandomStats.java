package SkillBuilders;

public class RandomStats {

	public static void main(String[] args) 
	{

		int[] outcomes = new int[10];
		int outcome;
		
		//Store values into the outcomes array
		
		for(int i =0; i < 100; i++)
		{
			outcome = (int)(10*Math.random());
			outcomes[outcome] += 1;
		}
	}

}
