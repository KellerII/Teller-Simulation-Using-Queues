/**
 * James Keller
 * ITCS 2214-002
 * 
 * LinkedQueue represents a linked implementation of a queue.
 * 
 */

package jss2;
import jss2.exceptions.*;

public class LinkedQueue<T> implements QueueADT<T>
{
   private int count;
   private LinearNode<T> front, rear;

   /**
    * Creates an empty queue.
    */
   public LinkedQueue()
   {
      count = 0;
      front = rear = null;
   }

   /**
    * Adds the specified element to the rear of this queue.
    *
    * @param element  the element to be added to the rear of this queue
    */
   public void enqueue (T element)
   {
      LinearNode<T> node = new LinearNode<T>(element);

      if (isEmpty())
         front = node;
      else
         rear.setNext (node);

      rear = node;
      count++;
   }

   /**
    * Removes the element at the front of this queue and returns a
    * reference to it. Throws an EmptyCollectionException if the
    * queue is empty.
    *
    * @return                           the element at the front of this queue
    * @throws EmptyCollectionException  if an empty collection exception occurs
    */
   public T dequeue() throws EmptyCollectionException
   {
      if (isEmpty())
         throw new EmptyCollectionException ("queue");

      T result = front.getElement();
      front = front.getNext();
      count--;

      if (isEmpty())
         rear = null;

      return result;
   }
   
   /**
    * Returns a reference to the element at the front of this queue.
    * The element is not removed from the queue.  Throws an
    * EmptyCollectionException if the queue is empty.  
    *
    * @return                            a reference to the first element in
    *                                    this queue
    * @throws EmptyCollectionsException  if an empty collection exception occurs
    */
   public T first() throws EmptyCollectionException
   {
      if (isEmpty())
         throw new EmptyCollectionException ("queue"); 

      return front.getElement();
   }

   /**
    * Returns true if this queue is empty and false otherwise. 
    *
    * @return  true if this queue is empty and false if otherwise
    */
   public boolean isEmpty()
   {
      return (count == 0);
   }
 
   /**
    * Returns the number of elements currently in this queue.
    *
    * @return  the integer representation of the size of this queue
    */
   public int size()
   {
      return count;
   }

   /**
    * Returns a string representation of this queue. 
    *
    * @return  the string representation of this queue
    */
   public String toString()
   {
      String result = "";
      LinearNode<T> current = front;

      while (current != null)
      {
         result = result + (current.getElement()).toString() + "\n";
         current = current.getNext();
      }

      return result;
   }
	
	/**
    * Resets a queue when called.
    * Resets the front and rear pointers to 0.
    * 
    */
	public void resetQueue()
   {
      count = 0;
      front = rear = null;
   }
}


















