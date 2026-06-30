import java.util.Scanner;

public class ques117{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[50];
        int[] rollNos = new int[50];
        int[] marks = new int[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNos[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nRoll No\tName\t\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                rollNos[i] + "\t" +
                                names[i] + "\t\t" +
                                marks[i]
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNos[i] == searchRoll) {
                            System.out.println("Student Found:");
                            System.out.println("Roll No: " + rollNos[i]);
                            System.out.println("Name: " + names[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNos[i] == updateRoll) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNos[i] == deleteRoll) {
                            for (int j = i; j < count - 1; j++) {
                                rollNos[j] = rollNos[j + 1];
                                names[j] = names[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Student record deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
