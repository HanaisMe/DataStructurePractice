package com.jeongsik.java.datastructure.test;

import com.jeongsik.java.datastructure.classes.ImmutableStack;
import com.jeongsik.java.datastructure.interfaces.Stack;

public class TestImmutableStack {
	
	public static void main(String[] args) {
		Stack <Integer> testStack = new ImmutableStack<>();
		try {
			testStack = testStack.push(5);
			print(testStack);
			testStack = testStack.push(10);
			print(testStack);
			testStack = testStack.push(15);
			print(testStack);
			testStack = testStack.push(20);
			print(testStack);
			testStack = testStack.push(25);
			print(testStack);
//			testStack = testStack.push(null);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void print(Stack<Integer> stack) throws Exception {
		while(!stack.isEmpty()){
			System.out.print(stack.head() + ", ");
			stack = stack.pop();
		}
		System.out.println();
	}

}
