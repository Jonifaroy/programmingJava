
import java.util.*;

class Amount 
{
    int a;
    int baseSalary;

    void calculateSalary() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the profession (1 for Developer\n 2 for Manager:");
        a = sc.nextInt();
        System.out.print("Enter the base salary: ");
        baseSalary = sc.nextInt();
    }
}

class Manager extends Amount 
{
    void salary() 
    {
        float bonus = baseSalary * 0.2f;
        float e = baseSalary + bonus;
        System.out.println("Mana Total Salary: " + e);
    }
}

class Developer extends Amount 
{
    void calculatedSalary() 
    {
        float bonus = baseSalary * 0.1f;
        float d = baseSalary + bonus;
        System.out.println("Devel Total Salary: " + d);
    }
}

public class Employee {
    public static void main(String args[]) 
    {
        Amount amount = new Amount();
        amount.calculateSalary();

        if (amount.a == 1) {
            Developer devel = new Developer();
            devel.baseSalary = amount.baseSalary;
            devel.calculatedSalary();
        } else if (amount.a == 2) {
            Manager mana = new Manager();
            mana.baseSalary = amount.baseSalary;
            mana.salary();
        } else {
            System.out.println("wrong choice.");
        }
    }
}
