import java.util.Scanner;

class TicketBooking {
    private int availableTickets;

    // Constructor
    TicketBooking(int totalTickets) {
        availableTickets = totalTickets;
    }

    // Book tickets
    void bookTicket(int tickets) {
        if (tickets <= availableTickets) {
            availableTickets -= tickets;
            System.out.println(tickets + " ticket(s) booked successfully.");
        } else {
            System.out.println("Sorry! Only " + availableTickets + " ticket(s) available.");
        }
    }

    // Cancel tickets
    void cancelTicket(int tickets) {
        availableTickets += tickets;
        System.out.println(tickets + " ticket(s) cancelled successfully.");
    }

    // Display available tickets
    void displayTickets() {
        System.out.println("Available Tickets: " + availableTickets);
    }
}

public class ques111{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of tickets: ");
        int totalTickets = sc.nextInt();

        TicketBooking booking = new TicketBooking(totalTickets);

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. View Available Tickets");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    booking.displayTickets();
                    break;

                case 2:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();
                    booking.bookTicket(book);
                    break;

                case 3:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();
                    booking.cancelTicket(cancel);
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

