import java.util.*;
public class Inputs
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the n values");
        int n=input.nextInt();
        int a[]=new int[n];
        int i=0;
        while(i<n)
        {
            System.out.println("enter the values");
            a[i]=input.nextInt();
            i=i+1;
        }
        while(i<n)
        {
            System.out.println("Enter the values"+a[i]);
            i=i+1;
        }
    }
}