package com.coffeepoweredcrew.bridge;

public class Client {

	public static void main(String[] args) {

		FifoCollection<Integer> fifoCollection = new Queue(new SinglyLinkedList());

		fifoCollection.offer(1);
		fifoCollection.offer(2);
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());



		FifoCollection<Integer> fifoCollection2 = new Queue(new ArrayLinkedList());
		fifoCollection2.offer(1);
		fifoCollection2.offer(2);
		System.out.println(fifoCollection2.poll());
		System.out.println(fifoCollection2.poll());
		System.out.println(fifoCollection2.poll());


	}

}
