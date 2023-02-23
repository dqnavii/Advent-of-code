
import java.util.*;

class Advent4
{
public static void main(String args[])
{

int n,i,j,a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter the case");

int num=sc.nextInt();
System.out.println("enter the number");
int count=0;

for(i=0;i<num;i++)
{
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
if (((c>=a && c<=b) && (d>=a && d<=b))||((a>=c && a<=d) && (b>=c && b<=d)))
{
count++;
}
}
System.out.println("answer"+count);
}
}