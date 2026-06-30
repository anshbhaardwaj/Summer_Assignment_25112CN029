import java.util.Scanner;

public class ques119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] empId = new int[50];
        String[] empName = new String[50];
        double[] empSalary = new double[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    empSalary[count] = sc.nextDouble();

                    count++;
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nID\tName\t\tSalary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" +
                                               empName[i] + "\t\t" +
                                               empSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found:");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Salary: " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId) {
                            System.out.print("Enter New Salary: ");
                            empSalary[i] = sc.nextDouble();
                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                empSalary[j] = empSalary[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Employee deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
