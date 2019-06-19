package com.jeongsik.java.datastructure.interfaces;

/**
 * Interface of queue.
 * 
 * @param T 	Represents generic type for elements of the queue.
 */
public interface Queue<T> {
	
	/**
	 * Returns a new queue, including the new element from the parameter at the beginning.
	 * 
	 * @param t		A new element to be added
	 * @return 		A new queue after inserting the element {@code t} to the beginning of the queue 
	 */
    public Queue<T> enQueue(T t);
    
    /**
	 * Returns a new queue, excluding the element at the beginning of the queue.
	 * 
	 * @return		A new queue after removing the first element from the queue.
	 */
    public Queue<T> deQueue();
    
    /**
     * Returns the head element of the queue.
     * 
     * @return		The head element of the queue.
     */
    public T head();
    
    /**
     * Returns the boolean value indicating whether the queue is empty or not.
     * 
     * @return		True when the queue is empty, False otherwise.
     */
    public boolean isEmpty();
    
}

