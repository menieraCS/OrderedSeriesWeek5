/**
 * @author Amanda Menier
 * @version 2.0
 * @since CSC6301 - Week 5
 */

package orderedSeries;

import java.util.Stack;

/**
 * OrderedStack inherits from the OrderedSeries class to store data in a 
 * sorted Stack.
 */

public class OrderedStack extends OrderedSeries {

    /**
     * The mySeries instance variable will hold the sorted Stack object 
     * behind the OrderedStack class.
     */

    protected Stack<Integer> mySeries;
    
    /**
     * Constructor for an ordered Stack
     * Initializes instance variable mySeries with an empty Stack.
     */

    public OrderedStack() {
        mySeries = new Stack<>();
    };


    /**
     * Adds new elements to the series and then sorts the structure.
     * Uses the push() and sort() methods built into the Stack class.
     * 
     * @param element the data to be added
     */

    @Override
     public void addSortedElement(Integer element) {
        mySeries.push(element);
        mySeries.sort(null); // sort smallest to largest
    }

    /**
     * Tells the user what type of series instance is used and displays the
     * data currently stored in the series.
     */
    @Override
     public void printSeries() {
        System.out.println("Your ordered series is a " + mySeries.getClass().getSimpleName() + ".");
        System.out.println("The elements in your series sorted smallest to largest are: ");
        System.out.println(mySeries);
    }

    /**
     * Allows the user to view the top of the stack. Uses the built-in peek
     * method.
     */

    public void viewTop() {
        System.out.print("The top of the stack is ");
        System.out.print(mySeries.peek());
    }

}