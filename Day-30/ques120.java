import java.util.Scanner;

public class ques120 { //Student management system
    static int[] rollNo = new int[100];
    static String[] name = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    public static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student added successfully.");
    }

    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nRoll No\tName\t\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
    }

    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll Number to Search: ");
        int searchRoll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == searchRoll) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + rollNo[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void updateMarks(Scanner sc) {
        System.out.print("Enter Roll Number to Update: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll Number to Delete: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                for (int j = i; j < count - 1; j++) {
                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Student record deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    updateMarks(sc);
                    break;
                case 5:
                    deleteStudent(sc);
                    break;
                case 6:
                    System.out.println("Exiting Project...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
