/**
 * @author Amanda Menier
 * @version 2.0
 * @since CSC6301 - Week 5
 */

package orderedSeries;

import java.util.LinkedList;

/**
 * OrderedLL inherits from the OrderedSeries class to store data in a 
 * sorted LinkedList.
 * 
 * @since CSC6301 - Week 4
 */
public class OrderedLL extends OrderedSeries {

    /**
     * Constructor for an ordered Linked List.
     * Initializes class instance variable mySeries with an empty Linked List.
     */

    public OrderedLL() {
        mySeries = new LinkedList<>();
    };

}