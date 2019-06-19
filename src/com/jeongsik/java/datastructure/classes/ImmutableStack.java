package com.jeongsik.java.datastructure.classes;

import com.jeongsik.java.datastructure.interfaces.Stack;

public class ImmutableStack<T> implements Stack<T> {

    private class NotEmptyStack extends ImmutableStack<T> {
    	
        private final T head;
        private final ImmutableStack<T> tail;

        private NotEmptyStack(T newElement, ImmutableStack<T> originalElements) {
            this.head = newElement;
            this.tail = originalElements;
        }

        @Override
        public ImmutableStack<T> pop() {
            return this.tail;
        }

        @Override
        public T head() {
            return this.head;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
        
    }

    @Override
    public ImmutableStack<T> pop() {
    	return null;
    }

    @Override
    public ImmutableStack<T> push(T t) {
        if (t == null) {
            throw new IllegalArgumentException();                       
        }
        return new NotEmptyStack(t, this);
    }

    @Override
    public T head() {
    	return null;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
    
}