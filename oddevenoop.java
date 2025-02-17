import java.util.Scanner;
class Check
{
void evenodd(int val)
{
if(val%2==0)
{
System.out.println("even number");

}
else
{
System.out.println("odd number");
}
}


public static void main(String args[])
{
Scanner num=new Scanner(System.in);
Check n=new Check();
System.out.println("enter a number");
int val=num.nextInt();
n.evenodd(val);
}
}
