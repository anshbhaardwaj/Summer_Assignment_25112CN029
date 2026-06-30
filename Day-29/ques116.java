import java.util.Scanner;

public class ques116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productNames = new String[50];
        int[] quantities = new int[50];
        double[] prices = new double[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product Name: ");
                    productNames[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantities[count] = sc.nextInt();

                    System.out.print("Enter Price: ");
                    prices[count] = sc.nextDouble();

                    count++;
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("\nProduct\t\tQuantity\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(productNames[i] + "\t\t" +
                                    quantities[i] + "\t\t" +
                                    prices[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (productNames[i].equalsIgnoreCase(search)) {
                            System.out.println("Product Found:");
                            System.out.println("Name: " + productNames[i]);
                            System.out.println("Quantity: " + quantities[i]);
                            System.out.println("Price: " + prices[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product Name to Update: ");
                    String update = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productNames[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantities[i] = sc.nextInt();
                            System.out.println("Quantity updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Product Name to Delete: ");
                    String delete = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productNames[i].equalsIgnoreCase(delete)) {
                            for (int j = i; j < count - 1; j++) {
                                productNames[j] = productNames[j + 1];
                                quantities[j] = quantities[j + 1];
                                prices[j] = prices[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Product deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
