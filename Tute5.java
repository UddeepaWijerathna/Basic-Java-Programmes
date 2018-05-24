class Tute5
{
	public static void main(String args[])
	{
		stair();
		fivestaircase();
		System.out.println("");
		human();
		humanonstairs();
		
	}
	public static void stair()
	{
		for(int i = 0; i < 5 ; i++)
		{
			if(i == 4)
				System.out.println("* * * *");
			else
				System.out.println("      *");

		}
	}

	public static void fivestaircase()
	{	int r=5;
		for(int n=0;n<5;n++)
		{
			String stepSpace = "";
			
			for(int j = 1; j < r; j++)
			{
				stepSpace += "       ";
				
			}
			r=r-1;

			for(int i = 0; i < 5 ; i++)
			{
				if(i == 4)
					System.out.println(stepSpace + "* * * *");
				else
					System.out.println(stepSpace + "      *");

			}
		  		
		}	
	}

	public static void human()
	{
        	System.out.println("   0  *");
        	System.out.println("  /|\\ *");
        	System.out.println("   |  *");
        	System.out.println("  / \\ *");
        	System.out.println("* * * *");
	}
	
	public static void humanonstairs()
	{
		int r=5;
		for(int n=0;n<5;n++)
		{
			String stepSpace = "";
			
			for(int j = 1; j < r; j++)
			{
				stepSpace += "       ";
				
			}
			
			if(r==4)
			{
        			System.out.println(stepSpace+"   0  *");
        			System.out.println(stepSpace+"  /|\\ *");
        			System.out.println(stepSpace+"   |  *");
        			System.out.println(stepSpace+"  / \\ *");
        			System.out.println(stepSpace+"* * * *");

				
			}
			else
			{
				for(int i = 0; i < 5 ; i++)
				{
					if(i == 4)
						System.out.println(stepSpace + "* * * *");
					else
						System.out.println(stepSpace + "      *");

				}
			}
			r=r-1;
		}
			
	}

}