import java.util.*;

public class dynamic {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        
        System.out.println("Choose an operation: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        int i = sc.nextInt();

        if (i == 1) {
            System.out.println("Result: " + (a + b));
        } else if (i == 2) {
            System.out.println("Result: " + (a - b));
        } else if (i == 3) {
            System.out.println("Result: " + (a * b));
        } else if (i == 4) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } 
        

    }
}
