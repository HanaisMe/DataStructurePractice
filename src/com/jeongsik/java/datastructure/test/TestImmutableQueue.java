package com.jeongsik.java.datastructure.test;

import com.jeongsik.java.datastructure.classes.ImmutableQueue;
import com.jeongsik.java.datastructure.interfaces.Queue;

public class TestImmutableQueue {

	public static void main(String[] args) {
		Queue <Integer> testQueue = new ImmutableQueue<>();
		try{
			testQueue = testQueue.enQueue(5);
			print(testQueue);
			testQueue = testQueue.enQueue(10);
			print(testQueue);
			testQueue = testQueue.enQueue(15);
			print(testQueue);
			testQueue = testQueue.enQueue(20);
			print(testQueue);
			testQueue = testQueue.enQueue(25);
			print(testQueue);
//			testQueue = testQueue.enQueue(null);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void print(Queue<Integer> queue) throws Exception {
		while(!queue.isEmpty()){
			System.out.print(queue.head() + ", ");
			queue = queue.deQueue();
		}
		System.out.println();
	}

}
