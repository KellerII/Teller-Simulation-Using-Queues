/**
 * James Keller
 * ITCS 2214-002
 * 
 * The customer class represents a waiting customer, although for the purpose of this program
 * none of the methods within the class were used.  This class was strictly used for 
 * instantiating linked queue objects within the main method. 
 *
 */

public class Customer
{
   private int arrivalTime, departureTime;

   /**
    * Creates a new customer with the specified arrival time.
    *
    * @param arrives  the integer representation of the arrival time
    */
   public Customer (int arrives)
   {
      arrivalTime = arrives;
      departureTime = 0;
   }

   /**
    * Returns the arrival time of this customer.
    *
    * @return  the integer representation of the arrival time
    */
   public int getArrivalTime()
   {
      return arrivalTime;
   }

   /**
    * Sets the departure time for this customer.
    *
    * @param departs  the integer representation of the departure time
    **/
   public void setDepartureTime (int departs)
   {
      departureTime = departs;
   }
   
   /**
    * Returns the departure time of this customer.
    *
    * @return  the integer representation of the departure time
    */
   public int getDepartureTime()
   {
      return departureTime;
   }

   /**
    * Computes and returns the total time spent by this customer.
    *
    * @return  the integer representation of the total customer time
    */
   public int totalTime()
   {
      return departureTime - arrivalTime;
   }
}
