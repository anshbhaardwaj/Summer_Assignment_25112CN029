import java.util.Scanner;

public class ques114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== MENU-DRIVEN ARRAY OPERATIONS =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum of Elements");
            System.out.println("3. Find Maximum Element");
            System.out.println("4. Find Minimum Element");
            System.out.println("5. Search an Element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Array Elements:");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum of elements = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max) {
                            max = num;
                        }
                    }
                    System.out.println("Maximum element = " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int num : arr) {
                        if (num < min) {
                            min = num;
                        }
                    }
                    System.out.println("Minimum element = " + min);
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}