import java.util.Scanner;

class leap
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the starting year");
		int yr1=in.nextInt();
		System.out.println("enter the ending year");
		int yr2=in.nextInt();
		System.out.println("leap years are:");
		for( int i=yr1;i<=yr2;i++)
		{
			if(i%4==0 && i%100!=0 || i%400==0)
			{
				System.out.println(i);
			}
		}
	}
}
