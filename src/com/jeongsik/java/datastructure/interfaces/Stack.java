package com.jeongsik.java.datastructure.interfaces;

/**
 * Interface of stack.
 * 
 * @param T 	Represents generic type for elements of the stack.
 */
public interface Stack<T> {

	/**
	 * Returns a new stack, including the new element from the parameter at the end.
	 * 
	 * @param t		A new element to be added
	 * @return 		A new stack after inserting the element {@code t} to the end of the stack 
	 */
	public Stack<T> push(T t);
	
    /**
	 * Returns a new stack, excluding the element at the end of the stack.
	 * 
	 * @return		A new stack after removing the last element from the stack.
	 */
	public Stack<T> pop();
	
	/**
     * Returns the head element of the stack.
     * 
     * @return		The head element of the stack.
     */
	public T head();
	
	/**
     * Returns the boolean value indicating whether the stack is empty or not.
     * 
     * @return		True when the stack is empty, False otherwise.
     */
	public boolean isEmpty();
	
}
