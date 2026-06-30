import java.util.Scanner;

public class ques118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[50];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    books[count] = sc.nextLine();
                    count++;
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBooks in Library:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String searchBook = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(searchBook)) {
                            System.out.println("Book found in the library.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Name to Delete: ");
                    String deleteBook = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(deleteBook)) {
                            for (int j = i; j < count - 1; j++) {
                                books[j] = books[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Book deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Mini Library System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
