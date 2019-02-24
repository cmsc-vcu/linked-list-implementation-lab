# linked-list-lab

 * Open the Project -> Properties -> Java Build Path 
 * In the Libraries tab, select Add Library on the right panel 
 * Add JUnit4, Apply and close
 * Open the DoubleLinkedListTest.java and DoubleLinkedList.java
 * Notice that most of the test cases are commented out of DoubleLinkedListTest.java. You will be practicing incremental test-driven development by un-commenting tests for specific methods as you implement the DoubleLinkedList.java class.
 * Run the DoubleLinkedListTest.java class Run -> Run As -> JUnit Test
 * The tests should fail because you haven't implemented any methods.
 
 * Look at the initializeDataFields(), it sets the first and last references to null and sets the numElements to 0. This is exactly what both the clear() method and constructor need to do, so call initializeDataFields() from both clear() and the constructor.
 * Implement getLength() so that it returns numElements 
 * Implement isEmpty() so that it returns true if first and last are null and numElements is 0
 * Run the DoubleLinkedListTest.java class and see that a green bar is displayed in the JUnit window
