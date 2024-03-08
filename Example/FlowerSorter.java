package Example;
import java.util.Scanner; // Import Scanner class

public class FlowerSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        String test = ""; // Initialize test variable
        
        while(!test.equals("quit")) {
            System.out.print("Enter quit to end: ");
            test = input.nextLine(); // Read user input
        }

        input.close(); // Close the scanner
    }
}


