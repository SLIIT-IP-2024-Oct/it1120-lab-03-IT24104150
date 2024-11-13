import java.util.Scanner;

public class IT24104150Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

// Prompt for number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        // Prompt for OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
double otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

// Display the result
        System.out.printf("Monthly Salary: %.2f
", monthlySalary);
        System.out.printf("OT Amount: %.2f
", otAmount);
        System.out.printf("Total Salary: %.2f
", totalSalary);

        // Close the scanner
        scanner.close();
    }
}