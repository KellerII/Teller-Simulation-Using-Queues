/**
 * James Keller
 *	ITCS 2214-002
 * 
 * LinearNode represents a node in a linked list.
 * 
 */

package jss2;

public class LinearNode<T>
{
  private LinearNode<T> next;
  private T element;
 
  /**
   * Creates an empty node.
   */
  public LinearNode()
  {
    next = null;
    element = null;
  }
 
  /**
   * Creates a node storing the specified element.
   *
   * @param elem  the element to stored within the created node
   */
  public LinearNode (T elem)
  {
    next = null;
    element = elem;
  }
 
  /**
   * Returns the node that follows this one.
   *
   * @return  the node that follows this one
   */
  public LinearNode<T> getNext()
  {
    return next;
  }
 
  /**
   * Sets the node that follows this one.
   *
   * @param node  the node to be set as the next node for this node
   */
  public void setNext (LinearNode<T> node)
  {
    next = node;
  }
 
  /**
   * Returns the element stored in this node.
   *
   * @return  the element that is stored within this node
   */
  public T getElement()
  {
    return element;
  }
 
  /**
   * Sets the element stored in this node.
   *
   * @param elem  the element to be stored within this node
   */
  public void setElement (T elem)
  {
    element = elem;
  }
}
