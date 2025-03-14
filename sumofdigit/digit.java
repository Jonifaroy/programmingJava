import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        int sum = 0;

        while (i < n) {
            System.out.println("Enter the number:");
            a[i] = sc.nextInt();
            i=i+1;
        }

        i = 0; 
        while (i < n) {
            sum += a[i];
            i=i+1;
        }

        System.out.println("Addition: " + sum);
    }
}
