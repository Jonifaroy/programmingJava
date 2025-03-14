class Dog
{
    void  bark()
    {
        System.out.println("Dag barks");
    }

}
class cat extends Dog
{
    void meow()
    {
     bark();
    }
}
public class Simple
{
    public static void main(String args[])
    {
        cat obj=new cat();
        obj.meow();
    }
}