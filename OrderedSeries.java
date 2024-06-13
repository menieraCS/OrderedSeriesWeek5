/**
 * @author Amanda Menier
 * @version 2.0
 * @since CSC6301 - Week 5
 */

package orderedSeries;

import java.util.List;

/**
 * Creates a template for using List-based Collections to created different
 * types of ordered lists. These different types of lists are called "series"
 * in this package. Designed to be easily extensible to other list types
 * such as Stacks.
 * 
 * @since CSC6301 - Week 4
 */
public class OrderedSeries {
    
    /**
     * Holds the List implementation instance that will hold the data in series.
     * The data must be of the Integer type.
     */
    protected List<Integer> mySeries;

    /**
     * Since List is an interface, this default constructor does nothing.
     */
    OrderedSeries() {};

    /**
     * Adds new elements to the series and then sorts the structure.
     * Uses the add() and sort() methods built into the List class.
     * 
     * @param element the data to be added
     */   
    public void addSortedElement(Integer element) {
        mySeries.add(element);
        mySeries.sort(null);
    }
    
    /**
     * Tells the user what type of series instance is used and displays the
     * data currently stored in the series.
     */
    public void printSeries() {
        System.out.println("Your ordered series is a " + mySeries.getClass().getSimpleName() + ".");
        System.out.println("The elements in your series are: ");
        System.out.println(mySeries);
    }
}
