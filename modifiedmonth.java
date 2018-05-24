import java.util.Scanner;
class modifiedmonth
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
        int no=0;
        
        if(capital.equals("JAN")) no=1;
        else if(capital.equals("FEB")) no=2;
        else if(capital.equals("MAR")) no=3;
        else if(capital.equals("APR")) no=4;
        else if(capital.equals("MAY")) no=5;
        else if(capital.equals("JUN")) no=6;
        else if(capital.equals("JUL")) no=7;
        else if(capital.equals("AUG")) no=8;
        else if(capital.equals("SEP")) no=9;
        else if(capital.equals("OCT")) no=10;
        else if(capital.equals("NOV")) no=11;
        else if(capital.equals("DEC")) no=12;
        System.out.println("No of the month is : "+ no);
    }
}