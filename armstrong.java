import java.util.Scanner;
class arm{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int n,r,sum=0;
System.out.println("Enter a number");
n=sc.nextInt();
while(n>0)
{	
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(n==sum)
{
System.out.println("it is a armstrong number");
}
else
{
System.out.println("Not a armstrong number");
}
}
}