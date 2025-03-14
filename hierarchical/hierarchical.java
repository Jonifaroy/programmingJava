class Parent
{
    void get()
    {
        System.out.println("Hey nobita");
    }
}
class child extends Parent
{
    void display()
    {
        get();
    }
}
class childs extends Parent
{
    void displays()
    {
        get();
    }
}
public class hierarchical
{


public static void main(String args[])
{
    childs obj=new childs();
    obj.displays();
    child obj2=new child();
    obj2.display();
}
}