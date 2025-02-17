import java.util.*;
class Product
{
int pcode,pprice;
String pname;

void read()
{
Scanner sc=new Scanner(System.in);
pcode=sc.nextInt();
pprice=sc.nextInt();
pname=sc.next();
}

void check(Product p1,Product p2,Product p3)
{

if(p1.pprice>p2.pprice && p1.pprice>p3.pprice)
{
if(p2.pprice<p3.pprice)
{
System.out.println("smalest price is "+ p2.pprice+ "   product is "+p2.pname);
}
else
{
System.out.println("smalest price is "+ p3.pprice + "   product is "+p3.pname);
}
}
else
{
System.out.println("smalest price is "+ p1.pprice + "   product is "+p1.pname);
}
}


public static void main(String args[])
{
Product p1=new Product();
System.out.println("Enter the price 1");
p1.read();
Product p2=new Product();
System.out.println("Enter the price 2");
p2.read();
Product p3=new Product();
System.out.println("Enter the price 3");
p3.read();

Product p=new Product();
p.check(p1,p2,p3);
}

}
