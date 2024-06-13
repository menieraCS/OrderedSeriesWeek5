/**
 * @author Amanda Menier
 * @version 2.0
 * @since CSC6301 - Week 5
 * 
 */

package orderedSeries;

import java.util.Scanner;


/**
 * A demonstration of code reuse, inheritance and composition.
 */

public class Main {

    /**
     * Main method which initializes a new OrderedStack object, takes user input,
     * places that input in a Stack object inside the OrderedStack object,
     * and displays the final stack to the user.
     * 
     * @param args default parameter for the main method - not used
     * 
     */

    public static void main(String[] args) {
        
        OrderedStack myList = new OrderedStack();

        Scanner scanner = new Scanner(System.in);

        while (true) {
        
            System.out.print("Enter a positive integer or 0 to quit: ");
            
            try {
                Integer myInt = scanner.nextInt();
                
                if (myInt <= 0) {
                    break;
                } else {
                    myList.addSortedElement(myInt);
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Invalid input - try again.");
                scanner.next(); // clears the scanner to prevent infinite loop

            }
   
        }

        scanner.close();

        myList.printSeries();
        myList.viewTop();

    }
    
}
