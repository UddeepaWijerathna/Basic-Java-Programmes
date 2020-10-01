class prime
{
	public static void main(String args[])
	{	
		int a=Integer.parseInt(args[0]);
		int i=1;
		for(int j=2;j<a/2;j++)                //every number is divisible by one , start with two
						   //if a number is not divided by half of itself ....its prime....shortcut :)
		{	
			if (a % i==0){
				i++;			//use break to come out of loop...immidiately
				break;
			}
		}
		if(i==2)
			System.out.println(a +" is  a prime number");
		
		else
			System.out.println(a +" is not a prime number");
		
	
}
