public class methodover
{
    public void add(int x,int y)
    {
        int z=x+y;
        System.out.println("Lets add:"+(z));

    }
    public void add(int x,int y,int z)
    {
        int r=x+y+z;
        System.out.println("Lets add 2:"+(r));
    }
    public static void main(String args[])
    {
        methodover obj=new methodover();
        obj.add(10,20);
        obj.add(10,20,30);

    }
}