import java.io.*;
import java.util.*;

class Advent1
{
public static void main(String args[])
{
int n,i,j,e,k;
Scanner sc=new Scanner(System.in);
System.out.println("The no of lvl of elf ");
e=sc.nextInt();
int b[]=new int[e];
for(k=0;k<e;k++)
{
System.out.println("The no of elf in level "+k+1);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Ente rthe calories carried by eleves ");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();  
}
int sum=0;
for(int l=0;l<n;l++)
{
sum+=a[l];
}
b[k]=sum;
}
int max=b[0];
for(i=0;i<e;i++)
{
if(max<b[i])
{
max=b[i];
}
}

System.out.println("The max no of cal are "+max);

}
}