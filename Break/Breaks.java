public class Breaks
{
    public static void main(String args[])
    {
        int i=0;
       
        while(i<=10)
        {
            if(i%2==0)
            {
                if(i<=5)
                {

                
                System.out.println(i);
                
                } else
                {
                    break;
                }

            }
             i=i+1;
        
        }
    }
}