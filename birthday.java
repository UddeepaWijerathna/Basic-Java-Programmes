class birthday
{
	public static void main(String args[])
	{
		int year=2017;
		int month=2;
		int day=21;
		int y=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int d=Integer.parseInt(args[2]);
		int a;
		int b;
		int c;
	if(year<y)
	{
		System.out.println("Invalid");
	}
	else
	{
		if(day>=d)
		{
			a=day-d;
			if(month>=m)
			{
				b=month-m;
				c=year-y;
			}
			else
			{
				b=month+12-m;
				c=year-1-y;
			}
		}
		else
		{
			a=day+30-d;
			if(month>m)
			{
				b=month-1-m;
				c=year-y;
			}
			else
			{
				b=month-1+12-m;
				c=year-1-y;
			}
		}
		System.out.println("Age is "+c+" years " +b+ " months "+a+ " days");
	}		
	}
}