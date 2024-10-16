package week1.day2;

public class CheckNumberIsPositive {
	
	public void checknumber()
	{
		for(int i=-5; i<=5; i++) 
		{
			if(i>0)
			{
				System.out.println(i +"The number is positive");
	
			}
			else 
			{
				System.out.println(i + "The number is negative");
			}
			
		}
	}

	public static void main(String[] args) {
		CheckNumberIsPositive c = new CheckNumberIsPositive();
		c.checknumber();
			
		}

	}


