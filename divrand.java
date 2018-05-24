import java.util.*;
class divrand
{
	public static void main(String args[])
	{
		Random rnd=new Random();
		int n1=rnd.nextInt(1000);
		System.out.println(n1);
		if(n1%2==0)
			System.out.println("divisible by 2");
		if(n1%3==0)
			System.out.println("divisible by 3");
		if(n1%5==0)
			System.out.println("divisible by 5");		

	
	}
}