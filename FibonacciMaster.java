
import java.util.Scanner;

/**
 * Unique Content: Fibonacci Sequence Generator
 * This Java program computes the sequence where each number
 * is the sum of the two preceding ones.
 */
public class FibonacciMaster {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Fibonacci Series Generator ---");
        System.out.print("Enter the number of terms to display: ");
        
        int terms = input.nextInt();
        
        long firstNum = 0;
        long secondNum = 1;
        
        System.out.println("\nGenerating " + terms + " terms:");
        
        // Loop to calculate and print the series
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstNum + (i == terms ? "" : ", "));

            // The Logic: Sum the previous two numbers
            long nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        
        System.out.println("\n----------------------------------");
        input.close();
    }
}