import java.util.*;
class Marks
{
    void calculateGrade(int marks)
    {
       
       if(marks>=90)
        {
            System.out.println('A');
        }
        else if(marks>=75)
        {
            System.out.println('B');
        }
        else if(marks>=50)
        {
            System.out.println('C');
        }
        else
        {
            System.out.println('F');
        }
        }
    }

public class Grade
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();
        Marks obj=new Marks();
        obj.calculateGrade(marks);
        }
        }

    }