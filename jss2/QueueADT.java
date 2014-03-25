/**
 * James Keller
 *	ITCS 2214-002
 * 
 * QueueADT defines the interface to a queue collection.
 * 
 */

package jss2;

public interface QueueADT<T>
{

   /**  
    * Adds one element to the rear of this queue. 
    * 
    * @param element  the element to be added to the rear of this queue  
    */
   public void enqueue (T element);

   /**  
    * Removes and returns the element at the front of this queue.
    * 
    * @return  the element at the front of this queue
    */
   public T dequeue();

   /**  
    * Returns without removing the element at the front of this queue.
    *
    * @return  the first element in this queue
    */
   public T first();
   
   /**  
    * Returns true if this queue contains no elements.
    * 
    * @return  true if this queue is empty
    */
   public boolean isEmpty();

   /**  
    * Returns the number of elements in this queue. 
    * 
    * @return  the integer representation of the size of this queue
    */
   public int size();

   /**  
    * Returns a string representation of this queue. 
    *
    * @return  the string representation of this queue
    */
   public String toString();
	
	/**  
    * Resets a queue when called. 
    *
    */
	public void resetQueue();
}

















