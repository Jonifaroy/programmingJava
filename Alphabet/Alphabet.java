import java. util.*;
public class Alphabet
{
    public static void main(String args[])
    { 
        String n[]={"a","e","i","o","u"};
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the alphabet");      
        String a=Sc.nextLine();
        int i=0;
        int detect=0;
            while(i<=4)
            {
                if(a.equals(n[i]))
                {
                    detect=1;
                }
            i=i+1;

            }
            if(detect==1)
            {
                System.out.println("vowels");

            }
            else
            {
                System.out.println("It is not a vowel");
            }
                
    }
}
    