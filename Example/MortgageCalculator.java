// import java.util.Scanner;

// public class MortgageCalculator {
//    public static void main(String[] args) {
//        // Create a Scanner object to get user input
//        Scanner scanner = new Scanner(System.in);

//        // Ask the user for the principal amount
//        System.out.print("Principal: ");
//        // Read the principal amount entered by the user
//        double principal = scanner.nextDouble();

//        // Ask the user for the annual interest rate
//        System.out.print("Annual Interest Rate: ");
//        // Read the annual interest rate entered by the user
//        double annualInterestRate = scanner.nextDouble();

//        // Ask the user for the loan term in years
//        System.out.print("Loan Term (Years): ");
//        // Read the loan term (in years) entered by the user
//        int years = scanner.nextInt();

//        // Calculate the monthly mortgage payment using the provided method
//        double monthlyPayment = calculateMortgage(principal, annualInterestRate, years);

//        // Display the calculated monthly payment to the user
//        System.out.println("Monthly Payment: $" + monthlyPayment);

//        // Close the Scanner object to release resources
//        scanner.close();
//    }

//    // Method to calculate the monthly mortgage payment
//    public static double calculateMortgage(double principal, double annualInterestRate, int years) {
//        // Calculate the monthly interest rate
//        double monthlyInterestRate = annualInterestRate / 100 / 12;
//        // Calculate the total number of payments (months)
//        int numberOfPayments = years * 12;

//        // Calculate the monthly mortgage payment using the provided formula
//        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
//               (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
//    }
// }



