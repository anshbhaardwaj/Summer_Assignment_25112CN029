import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double monthlySalary;

    Employee(int empId, String name, double monthlySalary) {
        this.empId = empId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary : " + (monthlySalary * 12));
        System.out.println("--------------------------------");
    }
}

public class ques107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee Salaries");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Monthly Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));
                    System.out.println("Employee record added successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nEmployee Salary Details:");
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Salary Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}