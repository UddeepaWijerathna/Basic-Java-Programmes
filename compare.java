import java.util.*;
class compare
{
	public static void main(String args[])
	{	
		String arr[]=new String[3];
		Scanner scn= new Scanner (System.in);
		
		System.out.println("Enter first name:");
		String s1=scn.nextLine();
		System.out.println("Enter second name:");
		String s2=scn.nextLine();
		System.out.println("Enter third name:");
		String s3=scn.nextLine();

		if(s1.compareTo(s2)<=0)	
		{
			if(s1.compareTo(s3)<=0)
			{
				arr[0]=s1;
				if (s2.compareTo(s3)<=0)
				{
					arr[1]=s2;
					arr[2]=s3;
				}
				else
				{
					arr[1]=s3;
					arr[2]=s2;
				}
			}
			else
			{
				arr[0]=s3;
				arr[1]=s1;
				arr[2]=s2;

			}
		}
		else
		{
			if(s2.compareTo(s3)<=0)
			{
				arr[0]=s2;
				if (s1.compareTo(s3)<=0)
				{
					arr[1]=s1;
					arr[2]=s3;
				}
				else
				{
					arr[1]=s3;
					arr[2]=s2;
				}
			}
			else
			{
				arr[0]=s3;
				arr[1]=s2;
				arr[2]=s1;
			}
		}
		for (int i=0;i<3;i++)
			System.out.print(arr[i]+" ");
	}
}