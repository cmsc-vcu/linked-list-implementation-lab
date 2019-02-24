
public class DoubleLinkedList<T> implements ListInterface<T> {
	private DoubleLinkedNode first;
	private DoubleLinkedNode last;
	private int numElements;

	public DoubleLinkedList() {
		
	}

	@Override
	public void add (T newEntry) {
		

	}

	@Override
	public void add (int newPosition, T newEntry) {
		
	}

	@Override
	public T remove (int givenPosition) {
		return null;
		}

	@Override
	public void clear () {

	}

	@Override
	public T replace (int givenPosition, T newEntry) {
		return null;
	}

	@Override
	public T getEntry (int givenPosition) {
		if ((givenPosition >= 1) && (givenPosition <= numElements))	{
			assert !isEmpty();
			return getNodeAt(givenPosition).getData();
		}
		else
			throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
	}

	@Override
	public T[] toArray() {
		return null;
	}

	@Override
	public boolean contains (T anEntry) {
		return false;
	}

	@Override
	public int getLength() {
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	// Initializes the class's data fields to indicate an empty list.
	private void initializeDataFields()  {
		first = null;
		last = null;
		numElements = 0;
	} 

	public DoubleLinkedNode getFirst() {
		return first;
	}

	public DoubleLinkedNode getLast() {
		return last;
	}

	// Returns a reference to the node at a given position.
	// Precondition: The chain is not empty;
	//               1 <= givenPosition <= numberOfEntries.	
	 DoubleLinkedNode getNodeAt(int givenPosition)	{
		assert !isEmpty() && (1 <= givenPosition) && (givenPosition <= numElements);
		DoubleLinkedNode currentNode = first;

		// Traverse the chain to locate the desired node
		// (skipped if givenPosition is 1)
		for (int counter = 1; counter < givenPosition; counter++)
			currentNode = currentNode.getNextNode();

		assert currentNode != null;

		return currentNode;
	} 

	
	 class DoubleLinkedNode{
		private T data;  	 
		private DoubleLinkedNode next;  	 // Link to next node
		private DoubleLinkedNode previous;       // Link to previous node

		private DoubleLinkedNode(T dataPortion){
			data = dataPortion;
			next = null;	
			previous = null;	
		}
		private DoubleLinkedNode(T dataPortion, DoubleLinkedNode nextNode, DoubleLinkedNode previousNode){
			data = dataPortion;
			next = nextNode;	
			previous = previousNode;
		} 

		 T getData(){
			return data;
		} 

		private void setData(T newData){
			data = newData;
		} 

		 DoubleLinkedNode getNextNode(){
			return next;
		} 

		private void setNextNode(DoubleLinkedNode nextNode){
			next = nextNode;
		} 

		 DoubleLinkedNode getPreviousNode(){
			return previous;
		}

		private void setPreviousNode(DoubleLinkedNode previousNode){
			previous = previousNode;
		}
	}
}
