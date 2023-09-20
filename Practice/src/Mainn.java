import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateNetSalary(int pfPercentage) {
        double pfAmount = (pfPercentage / 100.0) * salary;
        netSalary = salary - pfAmount;
    }
}

public class Mainn {
    public static void main(String[] args) {
        Employee employee = getEmployeeDetails();
        int pfPercentage = getPFPercentage();

        employee.calculateNetSalary(pfPercentage);

        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
    }

    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter Id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();

        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);

        return employee;
    }

    public static int getPFPercentage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PF Percentage:");
        int pfPercentage = scanner.nextInt();

        return pfPercentage;
    }
}
