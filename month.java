
import java.util.Scanner;
class month
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the name of the month:");
		String month=scn.nextLine();
		System.out.println(month);
		String first3= month.substring(0,3);
		String capital=first3.toUpperCase();
		System.out.println("Its abbreviation is "+ capital);
        	
		char c1,c2,c3;
        	int no=0;
        	c1= capital.charAt(0);
        	c2= capital.charAt(1);
        	c3= capital.charAt(2);
        
        	if(c1=='F')
			no=2;
        	else if(c1=='S')
            		no=9;
        	else if(c1=='O')
            		no=10;
        	else if(c1=='N')
            		no=11;
        	else if(c1=='D')
            		no=12;
        	else if (c1=='J')
		{
            		if(c2=='A')
                		no=1;
            		else if(c3=='N')
                		no=6;
            		else if(c3=='L')
                		no=7;
        	}
        	else if (c1=='M')
		{
            		if(c3=='R')
                		no=3;
            		else if(c3=='Y')
                		no=5;
        	}
        	else if (c1=='A')
		{
            		if(c2=='P')
                		no=4;
            		else if(c2=='U')
                		no=8;
        	}
		System.out.println("No of the month is "+no);	
	}
}