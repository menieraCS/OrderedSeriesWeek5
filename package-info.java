/**
* This package contains four classes that demonstrate inheritance,
*  composition, and code reuse. The OrderedSeries class creates a template
*  for creating different types of data structures that sort added data.
*  The OrderedLL class does so with a LinkedList structure. The OrderedStack class does so with a Stack structure. The Main class
*  demonstrates how the OrderedStack class can be used. Uses Oracle guidelines.
*  <br>
*  <br>
*  Software reuse examples:<br>
*  1) List interface in OrderedSeries class<br>
*  2) LinkedList class in OrderedLL class<br>
*  3) add() method in OrderedSeries class -> addSortedElement method<br>
*  4) sort() method in OrderedSeries class -> addSortedElement method<br>
*  5) OrderedLL inheriting methods and instance variable from OrderedSeries<br>
*  6) OrderedSeries designed to easily add new List implementations like Stack<br>
*  7) Other built in methods such as the Scanner and getClass()<br>
*  <br>
*  <br>
* Changes in this maintenance update:<br>
* 1a) Added OrderedStack class based that inherits from the OrderedSeries class.<br>
* 1b) Overrode methods as needed to apply to the Stack class and wrote a method to view the top of the stack using the built-in peek method.<br>
* 2a) Changed line 30 of the Main class to initialize an OrderedStack object instead of an OrderedLL object.<br>
* 2b) Added a call of the viewTop method to line 57 of the Main method.<br>
* 3a) Updated documentation to ensure completion and accuracy given the updates<br>
* 3b) Updated the UML diagram to reflect the new class.  <br>
*  <br>
*  <br>
*  Command information:<br>
*  To compile:          javac -d orderedSeries  *.java<br>
*  To run:              java -cp orderedSeries Main.java<br>
*  To create Javadocs:  javadoc -d docs *.java<br>
* 
* 
* @author Amanda Menier
* @version 2.0
* @since CSC6301 - Week 5
* 
*/

package orderedSeries;
