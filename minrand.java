import java.util.*;
class minrand
{
	public static void main(String args[])
	{
		Random rnd=new Random();
		int n1=rnd.nextInt(1000);
		
		int n2=rnd.nextInt(1000);
		if(n1>=n2)
			System.out.println(n2);
		else
			System.out.println(n1);	
	}
}