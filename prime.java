class prime
{
	public static void main(String args[])
	{	
		int a=Integer.parseInt(args[0]);
		int i=1;
		for(int j=1;j<a;j++)
		{
			 
		
		
		if (a % i==0)
		{
			i++;
		}
		}
		if(i==2)
		{
			System.out.println(a +" is  a prime number");
		}
		else
			System.out.println(a +" is not a prime number");
		}
	
}