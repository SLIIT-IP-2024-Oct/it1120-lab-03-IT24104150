import java.util.Scanner;
public class IT24104150Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
// Check if the number is five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
            return;
//Number to string to separate digits
        String numberStr = Integer.toString(number);
        //print separated digits by space
        for (int i = 0; i < numberStr.length(); i++) {
System.out.print(numberStr.charAt(i));
            if(i < numberStr.length() - 1){
                System.out.print(" "); // Print space after each digit except the last one
}
        }
        System.out.println(); // Print a new line after the output
        // Close the scanner
        scanner.close();
    }
}