import java.util.Scanner;
class Check
{
public static void main(String args[])
{
Scanner num=new Scanner(System.in);
System.out.println("enter a number");
int val=num.nextInt();

if(val%2==0)
{
System.out.println("even number");

}
else
{
System.out.println("odd number");
}
}
}
