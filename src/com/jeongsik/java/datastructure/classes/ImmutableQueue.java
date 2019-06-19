package com.jeongsik.java.datastructure.classes;

import java.util.ArrayList;

import com.jeongsik.java.datastructure.interfaces.Queue;

public class ImmutableQueue<T> implements Queue<T> {
	
	private ArrayList<T> queuedList = new ArrayList<>();
	
	public ImmutableQueue() {}
	
	/**
	 * Instance initializer, which creates a new queue by dequeuing activity.
	 * 
	 * @param originalQueue		The original queue before dequeuing.
	 */
	public ImmutableQueue(ImmutableQueue<T> originalQueue) {
		ArrayList<T> newQueuedList = new ArrayList<>(originalQueue.queuedList);
		newQueuedList.remove(0);
	    this.queuedList = newQueuedList;
	}
	
	/**
	 * Instance initializer, which creates a new queue by enqueuing activity.
	 * 
	 * @param newItem			The new item.
	 * @param originalQueue		The original queue before dequeuing.
	 */
	public ImmutableQueue(T newItem, ImmutableQueue<T> originalQueue) {
		ArrayList<T> newQueuedList = new ArrayList<>(originalQueue.queuedList);
		newQueuedList.add(newItem);
	    this.queuedList = newQueuedList;
	}

	/**
	 * Returns a new queue, excluding the element at the beginning of the queue.
	 * 
	 * @return		A new queue after removing the first element from the queue.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ImmutableQueue<T> deQueue() {
		if (queuedList.isEmpty()) {
			return null;
		} else {
		    return new ImmutableQueue(this);
		}
	}
	
	/**
	 * Returns a new queue, including the new element from the parameter at the beginning.
	 * 
	 * @param t		A new element to be added
	 * @return 		A new queue after inserting the element {@code t} to the beginning of the queue 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ImmutableQueue<T> enQueue(T t) {
	    if (t == null) {
	        throw new IllegalArgumentException();                       
	    }
	    return new ImmutableQueue(t, this);
	}

	/**
     * Returns the head element of the queue.
     * 
     * @return		The head element of the queue, null when empty.
     */
	@Override
	public T head() {
		if (queuedList.isEmpty()) {
			return null;
		} else {
			return queuedList.get(0);
		}
	}

	/**
     * Returns the boolean value indicating whether the queue is empty or not.
     * 
     * @return		True when the queue is empty, False otherwise.
     */
	@Override
	public boolean isEmpty() {
		return queuedList.isEmpty();
	}
	
}