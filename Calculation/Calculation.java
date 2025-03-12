public class Calculation
{
    public int add(int a , int b)
    {
        int c=a+b;
        return c;
    }
    public int subtract(int a , int b)
    {
        int d=a-b;
        return d;
    }
    public  int multiply(int a ,int b)
    {
        int e=a*b;
        return e;
    }
    public int divide(int a , int b)
    {
        int f=a/b;
        return f;
    }
    public static void main(String args[])
    {
        Calculation obj=new Calculation();
        int c=obj.add(10,20);
        int d=obj.subtract(40,20);
        int e=obj.multiply(12,2);
        int f=obj.divide(50,10);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}