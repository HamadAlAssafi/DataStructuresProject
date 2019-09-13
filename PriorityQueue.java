/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

/**
 *
 * @author Shereio
 */

public class PriorityQueue<Key extends Comparable<? super Key>, T> {
    private PriorityQueueNode<Key, T> firstNode; // reference to first node
    private int numberOfEntries;

    public PriorityQueue(){
        clear();
    }
    
    public final void clear() // note the final method
    {
        firstNode = null;
        numberOfEntries = 0;
    } // end clear

    public boolean isEmpty(){
        boolean result;
        if (numberOfEntries == 0) // or getLength() == 0
        {
        assert firstNode == null;
        result = true;
        }
        else
        {
        assert firstNode != null;
        result = false;
        } // end if
        return result;
    }
    
    private boolean add(int newPosition, Key k, T newEntry)
        {
        boolean isSuccessful = true;
        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1))
        {
        PriorityQueueNode<Key, T> newNode = new PriorityQueueNode<Key, T>(k, newEntry);
        if (newPosition == 1) // case 1
        {
        newNode.setNext(firstNode);
        firstNode = newNode;
        }
        else // case 2: list is not empty
        { // and newPosition > 1
        PriorityQueueNode<Key, T> nodeBefore = getNodeAt(newPosition - 1);
        PriorityQueueNode<Key, T> nodeAfter = nodeBefore.getNext();
        newNode.setNext(nodeAfter);
        nodeBefore.setNext(newNode);
        } // end if
        numberOfEntries++;
        }
        else
        isSuccessful = false;
        return isSuccessful;
    } // end add
    
    private PriorityQueueNode<Key, T> getNodeAt(int givenPosition)
    {    
        PriorityQueueNode<Key, T> currentNode = firstNode;
        // traverse the chain to locate the desired node
        for (int counter = 1; counter < givenPosition; counter++)
        currentNode = currentNode.getNext();
        assert currentNode != null;
        return currentNode;
    } // end getNodeAt
    
    private T get(int givenPosition)
    {
        T result = null; // result to return
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
        assert !isEmpty();
        result = getNodeAt(givenPosition).getData();
    } // end if
    return result;
    } // end getEntry
    
    public int size()
    {
        return numberOfEntries;
    }
    
    public void enQueue(Key k, T newEntry){
        if (isEmpty())
            add(1, k, newEntry);
        else // add to end of nonempty list
        {
            int i = 1;
            while(i <= size() && k.compareTo(getNodeAt(i).getKey()) <= 0)
                i++;
            add(i, k, newEntry);
        } // end if
    }
    
    private T remove(int givenPosition)
    {
        T result = null; // return value
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
        assert !isEmpty();
        if (givenPosition == 1) // case 1: remove first entry
        {
        result = firstNode.getData(); // save entry to be removed
        firstNode = firstNode.getNext();
        }
        else // case 2: not first entry
        {
        PriorityQueueNode<Key, T> nodeBefore = getNodeAt(givenPosition - 1);
        PriorityQueueNode<Key, T> nodeToRemove = nodeBefore.getNext();
        PriorityQueueNode<Key, T> nodeAfter = nodeToRemove.getNext();
        nodeBefore.setNext(nodeAfter);

        result = nodeToRemove.getData(); // save entry to be removed
        } // end if
        numberOfEntries--;
        } // end if
        return result; // return removed entry, or
        // null if operation fails
    } // end remove
    
    public T deQueue(){
        return remove(1);
    }

    public T peek(){
        if(isEmpty())
            return null;
        else 
            return get(1);
    }  
}

