import java.util.*;
class fib
{
	public static void main(String arg[])
	{
		int n1=0,n2=1,next;
		System.out.println("fibonacci is ");
		System.out.println(+n1);
		System.out.println(+n2);
		for(int i=1;i<=10;i++)
		{
			next=n1+n2;
			System.out.println(+next);
			n1=n2;
			n2=next;
		}
			

}
}