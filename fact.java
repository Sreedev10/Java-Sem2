import java.util.Scanner;

class Fact
{
	public static void main(String args[])
	{
		Scanner f=new Scanner(System.in);
		System.out.println("enter a number");
		int val=f.nextInt();
		int i;
		int a=1;

		for(i=val;i>=1;i--)
		{
			a=a*i;
		}
		System.out.println("factorial of number" + a);
	}
}
