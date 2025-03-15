import java.util.*;
public class unlimited

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(true)
        {

        
        System.out.println("1.Developer\n2.Manager");
      
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
    
}