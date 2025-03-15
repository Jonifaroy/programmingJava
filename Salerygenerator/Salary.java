import java.util.*;
public class Salary
{
    public static void main(String args[])
    {
        System.out.println("1.Developer\n2.Manager");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the profession");
        int a=sc.nextInt();
        System.out.println("Enter the salary");
        int b=sc.nextInt();
        if(a==1)
        {
            float c=b*0.1f;
            float d=b+c;
            System.out.println(d);
        }
        else if(a==2)
        {
            float e=b*0.2f;
            float f=b+e;
            System.out.println(f);
        }

    }
    
}