import java.util.Scanner;
class Q1
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the date of the month");
		int date=scn.nextInt();
		int i=1;
		for(int j=1;j<date;j++)
		{
			if (date % i==0)
			{
				i++;
			}
		}
		if(i==2)
		{
			System.out.println("There will be a crime");
		}
		else
		{
			System.out.println("There won't be a crime");
		}
	}

}