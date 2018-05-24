import java.util.*;
class rand
{
	public static void main(String args[])
	{
		Random rnd=new Random();
		int n=rnd.nextInt();
		if(n>0)
			System.out.println("Positive Number");		
	}
}