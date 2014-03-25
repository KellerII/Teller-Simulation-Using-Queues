/**
 * James Keller
 * ITCS 2214-002
 *
 */
package jss2.exceptions;

public class ElementNotFoundException extends RuntimeException
{
   /**
    * Sets up this exception with an appropriate message.
    */
   public ElementNotFoundException (String collection)
   {
      super ("The target element is not in this " + collection);
   }
}
