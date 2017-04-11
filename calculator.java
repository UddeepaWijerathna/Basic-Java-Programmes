class calculator
{
	public static void main(String args[])
	{
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		String z=args[2];

		switch(z)
		{
			case "+":
				System.out.println(x+y);
				break;
			case "-":
				System.out.println(x-y);
				break;
			case "*":
				System.out.println(x*y);
				break;
			case "/":
				if(y==0)
				{
					System.out.println("invalid input");
				}
				else
					System.out.println(x/y);
					break;
			case "%":
				System.out.println(x%y);
				break;
		}
	}

}