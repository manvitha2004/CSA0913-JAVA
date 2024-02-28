class Fibo implements Runnable
{
    public void run()
    {
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=10;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
class ReverseOrder extends Thread
{
    public void run()
    {
        for(int i=10;i>=1;i--)
        {
            System.out.println(i+" ");
        }
    }
}
class Numbers {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Fibo());
        Thread t2 = new Thread(new ReverseOrder());
        t1.start();
        t2.start();
    }
}
