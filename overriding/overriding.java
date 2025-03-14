class Parent
{
    void get()
    {
        System.out.println("Hey shizuka");

    }
}
class child extends Parent
{
    void get()
    {
        System.out.println("Hey nobita");
    }
}
public class overriding
{
    public static void main(String args[])
    {
        child obj=new child();
        obj.get();
    }
}