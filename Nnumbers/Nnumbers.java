import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int x = Sc.nextInt();
        int i = 1;
        while (i <= x) {
            System.out.println(i);
            i++;
        }
    }
}
