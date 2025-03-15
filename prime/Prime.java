import java.util.Scanner;

public class Prime 
    {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        int detect=0;
        int detect2=0;
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                detect=detect+1;
            }
            i=i+1;
        }
        if(detect==3)
        {
            System.out.println("Not a prime number");

        }
        else
        {
            System.out.println("Prime number");
        }
    }
    }


        
       