import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("---------------------");
    }
}

public class ques112 {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        contacts.add(new Contact(name, phone));
        System.out.println("Contact Added Successfully!");
    }

    public static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\nContact List:");
        for (Contact c : contacts) {
            c.display();
        }
    }

    public static void searchContact() {
        System.out.print("Enter Name to Search: ");
        String searchName = sc.nextLine();

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(searchName)) {
                c.display();
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    public static void deleteContact() {
        System.out.print("Enter Name to Delete: ");
        String deleteName = sc.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equalsIgnoreCase(deleteName)) {
                contacts.remove(i);
                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}