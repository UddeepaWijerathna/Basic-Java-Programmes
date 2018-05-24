import java.lang.Math;
import java.util.Random;
class leapyear
{
	public static void main(String args[])
	{
		Random rand=new Random();
		float x=rand.nextFloat();
		int year= Math.round( 200*x +1800);
		System.out.println(year);
		if(year%400==0)
			System.out.println("leap year");
		if((year%4==0) && (year%100 != 0))
			System.out.println("leap year");
		else
			System.out.println("not a leap year");		
	}
}