# OrderedSeriesWeek5
 This package contains four classes that demonstrate inheritance,
 composition, and code reuse. The OrderedSeries class creates a template
 for creating different types of data structures that sort added data.
 The OrderedLL class does so with a LinkedList structure. The OrderedStack class does so with a Stack structure. The Main class
 demonstrates how the OrderedStack class can be used. Use Oracle guidelines.
 
 ### Software reuse examples:
 1) List interface in OrderedSeries class
 2) LinkedList class in OrderedLL class
 3) add() method in OrderedSeries class -> addSortedElement method
 4) sort() method in OrderedSeries class -> addSortedElement method
 5) OrderedLL inheriting methods and instance variable from OrderedSeries
 6) OrderedSeries designed to easily add new List implementations like Stack
 7) Other built in methods such as the Scanner and getClass()

### Changes in this maintenance update:
1a) Added OrderedStack class based that inherits from the OrderedSeries class.
1b) Overrode methods as needed to apply to the Stack class and wrote a method to view the top of the stack using the built-in peek method.
2a) Changed line 30 of the Main class to initialize an OrderedStack object instead of an OrderedLL object.
2b) Added a call of the viewTop method to line 57 of the Main method.
3a) Updated documentation to ensure completion and accuracy given the updates
3b) Updated the UML diagram to reflect the new class.  
 
 ## Command information:
 To compile:          javac -d orderedSeries  *.java
 To run:              java -cp orderedSeries Main.java
 To create Javadocs:  javadoc -d docs *.java

### Planning:
I created a small waterfall chart outlining what I thought would be the steps of this maitenance task. I then went back and added my actuals. I was pretty close to the plan, until the end, when it took me longer to finish tweaking the documentation than I had expected. 

### Directory and File information:
 /docs  		javadocs export
 /orderedSeries  	compiled files
 Ordered Series UML v2  UML diagram
 Planning diagram  	the waterfall chart I created
