import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int n,i,j,count;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
n=sc.nextInt();
System.out.println("Prime numbers are");
for(i=2;i<=n;i++)
{
count=0;
for(j=2;j<i;j++)
{
if(i%j==0)
count=1;
}
if(count==0)
System.out.println(i);
}
}
}