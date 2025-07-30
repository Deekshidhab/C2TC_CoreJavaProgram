package assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first line and split using comma
        String[] ticketDetails = sc.nextLine().split(",");
        String stageEvent = ticketDetails[0];
        String customer = ticketDetails[1];
        int noOfSeats = Integer.parseInt(ticketDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = Integer.parseInt(sc.nextLine());

        booking.displayDetails();

        switch (choice) {
            case 1:
                double amount1 = Double.parseDouble(sc.nextLine());
                booking.makePayment(amount1);
                break;

            case 2:
                double amount2 = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                booking.makePayment(amount2, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double amount3 = Double.parseDouble(sc.nextLine());
                String creditCardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amount3, creditCardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
