import java.util.Scanner;

public class ques115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== MENU-DRIVEN STRING OPERATIONS =====");
            System.out.println("1. Display String");
            System.out.println("2. Find String Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("String: " + str);
                    break;

                case 2:
                    System.out.println("Length of String: " + str.length());
                    break;

                case 3:
                    System.out.println("Uppercase String: " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase String: " + str.toLowerCase());
                    break;

                case 5:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + reverse);
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}