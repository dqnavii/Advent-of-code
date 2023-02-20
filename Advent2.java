import java.util.*;
class Advent2
{
public static void main(String args[])
{

int n,i,j,e,k,d,sum1=0,sum2=0,sum3=0,ans=0;
char a,b;

Scanner sc=new Scanner(System.in);

System.out.println("The no of inputs ");

n=sc.nextInt();

for(k=0;k<n;k++)
{

System.out.println("enter opponent's choice ");
a=sc.next().charAt(0);

System.out.println("enter Your's choice ");
b=sc.next().charAt(0);

if(b=='X')//rock
{
if(a=='A')//rock
{
  sum1=sum1+4;
}

else if (a=='B')//paper
{
  sum1=sum1+8;
}

else //scissor
{
  sum1=sum1+3;
}

}



if(b=='Y')//paper
{
if(a=='A') //rock
{
  sum2+=1;
}
else if (a=='B')//paper
{
  sum2+=5;
}
else //scissor
{
  sum2+=9;
}
}


if(b=='Z')//scissor
{
if(a=='A') //rock
{
  sum3+=7;
}
else if (a=='B')//paper
{
  sum3+=2;
}
else //scissor
{
  sum3+=6;
}
}

}
ans=sum1+sum2+sum3;
System.out.println(ans);
}}