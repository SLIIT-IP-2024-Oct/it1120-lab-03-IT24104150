import java.util.Scanner;
public class IT24104150Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
double pricePerKg = scanner.nextDouble();
        // Number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        // Calculate the total amount before discount
double totalAmount = pricePerKg * kilograms;
        // Calculate the discount
        double discount = totalAmount * 0.10; // 10% discount
        double amountAfterDiscount = totalAmount - discount;
  
        System.out.printf("The total amount with 10% discount is: %.2f
", amountAfterDiscount);
        // Close the scanner
        scanner.close();
    }
}