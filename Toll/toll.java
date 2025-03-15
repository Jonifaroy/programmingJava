import java.util.*;

public class toll {
    public static void main(String args[]) {
        int car = 100;
        float cars = car * 0.1f;
        float cars1 = car - cars;
        int truck = 200;
        float trucks = truck * 0.1f;
        float truck1 = truck - trucks;

        System.out.println("1.Car\nTruck");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ENTER THE VEHICLE");
            int i = sc.nextInt();
            if (i == 1) {
                System.out.println("1.YES RFID\n 2.NO RFID ");
                int RFID = sc.nextInt();
                if (RFID == 1) {
                    System.out.println("Toll fee " + cars1);
                } else {
                    System.out.println("Toll fee " + cars);
                }
            } else if (i == 2) {
                System.out.println("1.YES RFID\n 2.NO RFID");
                int RFID = sc.nextInt();
                if (RFID == 1) {
                    System.out.println("Toll fee " + truck1);
                } else {
                    System.out.println("Toll fee " + trucks);
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
