import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(20);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Book Seat\n2. Cancel Seat\n3. Show Booked Seats\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 4) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter Your Name: ");
                    scanner.nextLine(); 
                    String passengerName = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    int seatNumber = scanner.nextInt();
                    bus.bookSeat(seatNumber, passengerName);
                    break;

                case 2:
                    System.out.print("Enter Seat Number to Cancel: ");
                    int cancelSeatNumber = scanner.nextInt();
                    bus.cancelSeat(cancelSeatNumber);
                    break;

                case 3:
                    System.out.println("\nList of booked seats:");
                    bus.showBookedSeats();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using our service.");
        scanner.close();
    }
}
