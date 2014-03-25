/**
 * James Keller
 * ITCS 2214-002
 * 
 * The following program simulates a customer queue that may be encountered 
 * at a branch bank.  It accounts for multiple traffic periods throughout the day
 * and customer traffic patterns while minimizing the number of tellers to cap the 
 * maximum queue at 14 people.
 *
 */

import jss2.*;

public class tellerSimulation   
{
   public static void main ( String[] args) 
   {
	   /**  
       * Instantiating 3 LinkedQueue objects of the type <Customer> for
       * use in the 3 different time/loop intervals.  Variable intialization
       * for customer, a counter for seconds, the queue size constraint (14),
		 * and the initial number of tellers at the start of the loop.
		 *
       */
	 	Customer customer;  
		LinkedQueue<Customer> customerQueue = new LinkedQueue<Customer>();
		LinkedQueue<Customer> customer2Queue = new LinkedQueue<Customer>();
		LinkedQueue<Customer> customer3Queue = new LinkedQueue<Customer>();
		
		int secondCounter = 0;
		int queueSize = 14;
		int tellers = 1;
		
		System.out.println("Running the teller simulation for the time period: 9:00am to 10:00am." + "\n");
	   /**  
       * A while loop which breaks down the time period into seconds using 
       * 60secs * number of minutes per period.  A counter increments each 
		 * time the loop executes...mimicking a second timer.  Variables are
       * initialized with the customer enqueue rates for the 
		 * specified time period.
		 *
       */
		while(secondCounter < (60*60))
		{     
			secondCounter++;	
			int enqueueAmount = 5;
			
		   /**  
          * An if statement catches queues that are over the specified
			 * limit of 14.  The amount of tellers is increased by one 
          * along with their corresponding dequeue rate since 
			 * 1 teller = 1 dequeue per 45 secs.  The second counter is 
			 * reset so that the loop can run again with the new teller amount.
			 * The resetQueue() method is also called to clear any current objects
			 * that may have been enqueued before the reset occurs.  A print statement
			 * tracks the progress of the loop and whether or not the current try with
			 * the specified number of tellers was successful in keeping the queue under
			 * 14 people.
          * 
          */
			if ((customerQueue.size()) > queueSize)
			{
				tellers++;
				System.out.println("The current queue capacity has been reached...");
				System.out.println("Restarting the queue with " + tellers + " tellers.");
				secondCounter = 0;
				customerQueue.resetQueue();
				//System.out.println("Size: " + customerQueue.size());
			}
			/**  
          * If statement and for loop that enqueue the assigned number of
			 * of customers every 60 secs.  customerQueue's are filled with 
			 * new Customer objects with 0 as a passing parameter.
          * 
          */
			if ((secondCounter % 60) == 0)
			{
				for (int count = 0; count < enqueueAmount; count++)
				{
					customerQueue.enqueue(new Customer(0));
					//System.out.println("Adding a customer to the queue.");
					//System.out.println("Size: " + customerQueue.size());
				}
			}
			/**  
          * Multiple if statements and for loops that dequeue the proper
			 * number of customers from the queue according to the number of
			 * tellers available.  Dequeues occur if the queue is not empty.
			 * If the number of dequeues is greater than the number of customer
			 * objects in the queue, the loop calls the resetQueue() method
			 * to prevent an error/catch.  This simulates all available tellers 
			 * handling the remaining customers if there are more tellers than 
			 * currently queued customers.
          * 
          */
			if ((secondCounter % 45) == 0)
			{
				for (int counter = 0; counter < tellers; counter++)
				{
					if (!(customerQueue.isEmpty()))
					{
							if ((customerQueue.size()) > 0)
							{
								customerQueue.dequeue();
								//System.out.println("Removing a customer from the queue.");
								//System.out.println("Size: " + customerQueue.size());
							}
							if ((customerQueue.size()) <= 0)
							{
								customerQueue.resetQueue();
							}
					}
				}
			}
		}
	  /**  
      * Final print statement indicating the minimum number of tellers needed to 
	   * run the simulation without creating a queue of more than 14 people.
      */
		System.out.println("\nThe optimal number of tellers for this shift is: " + tellers + ".\n\n");
		
		secondCounter = 0;
		tellers = 1;
		
		System.out.println("Running the teller simulation for the time period: 10:01am to 1:00pm." + "\n");
	   /**  
       * This loop simulates the second time period with different per minute queue rates.
		 * The loop time has also been adjusted for the second time period.  All other operations
		 * are consistent with the first loop.
       * 
       */
		while(secondCounter < (60*179))
		{     
			secondCounter++;	
			int enqueueAmount = 10;
			
			if ((customer2Queue.size()) > queueSize)
			{
				tellers++;
				System.out.println("The current queue capacity has been reached...");
				System.out.println("Restarting the queue with " + tellers + " tellers.");
				secondCounter = 0;
				customer2Queue.resetQueue();
			}
			
			if ((secondCounter % 60) == 0)
			{
				for (int count = 0; count < enqueueAmount; count++)
				{
					customer2Queue.enqueue(new Customer(0));
					//System.out.println("Adding a customer to the queue.");
				}
			}
			
			if ((secondCounter % 45) == 0)
			{
				for (int counter = 0; counter < tellers; counter++)
				{
					if (!(customer2Queue.isEmpty()))
					{
							if ((customer2Queue.size()) > 0)
							{
								customer2Queue.dequeue();
								//System.out.println("Removing a customer from the queue.");
							}
							if ((customer2Queue.size()) <= 0)
							{
								customer2Queue.resetQueue();
							}
					}
				}
			}
		}
		
		System.out.println("\nThe optimal number of tellers for this shift is: " + tellers + ".\n\n");
		
		secondCounter = 0;
		tellers = 1;
		
		System.out.println("Running the teller simulation for the time period: 1:01pm to 5:00pm." + "\n");
		/**  
       * This loop simulates the third time period with different per minute queue rates.
		 * The loop time has also been adjusted for the third time period.  All other operations
		 * are consistent with the first loop.
       * 
       */
		while(secondCounter < (60*239))
		{     
			secondCounter++;	
			int enqueueAmount = 3;
			
			if ((customer3Queue.size()) > queueSize)
			{
				tellers++;
				System.out.println("The current queue capacity has been reached...");
				System.out.println("Restarting the queue with " + tellers + " tellers.");
				secondCounter = 0;
				customer3Queue.resetQueue();
			}
			
			if ((secondCounter % 60) == 0)
			{
				for (int count = 0; count < enqueueAmount; count++)
				{
					customer3Queue.enqueue(new Customer(0));
					//System.out.println("Adding a customer to the queue.");
				}
			}
			
			if ((secondCounter % 45) == 0)
			{
				for (int counter = 0; counter < tellers; counter++)
				{
					if (!(customer3Queue.isEmpty()))
					{
							if ((customer3Queue.size()) > 0)
							{
								customer3Queue.dequeue();
								//System.out.println("Removing a customer from the queue.");
							}
							if ((customer3Queue.size()) <= 0)
							{
								customer3Queue.resetQueue();
							}
					}
				}
			}
		}
		
		System.out.println("\nThe optimal number of tellers for this shift is: " + tellers + ".");
   }
}
























