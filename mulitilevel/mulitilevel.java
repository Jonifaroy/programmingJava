class Parent
{
    void get()
    {
        System.out.println("Hey shizuka");
    }
}
class child extends Parent
{
    void display()
    {
        get();
    }
}
class childs extends child
{
    void display2()
    {
        display();
    }
}
public class mulitilevel
{
public static void main(String args[])
   {
    childs obj=new childs();
    obj.display2();
   }
}