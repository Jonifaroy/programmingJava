public class Return
{
    public int value(int num)
    {
        return num;
    }
    public static void main(String args[])
    {
        Return obj=new Return();
        int a=obj.value(10);
        System.out.println(a);
    }
    }
