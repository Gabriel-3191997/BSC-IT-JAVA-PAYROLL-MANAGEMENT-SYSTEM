import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Payroll Management System");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Employee\n2. Process Payroll\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // consume newline

                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basicSalary = scanner.nextDouble();

                    Employee employee = new Employee(id, name, basicSalary);

                    System.out.print("Enter Bonus: ");
                    employee.setBonus(scanner.nextDouble());

                    System.out.print("Enter Deduction: ");
                    employee.setDeduction(scanner.nextDouble());

                    payroll.addEmployee(employee);
                    break;

                case 2:
                    payroll.processPayroll();
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting Payroll Management System");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
