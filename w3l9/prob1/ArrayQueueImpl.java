package w3l9.prob1;

public class ArrayQueueImpl {
	int[] arr = new int[5];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		if (front != -1) {
			return arr[front];
		} else {
			System.out.println("Array is Empty");
			return -1;
		}
	}

	public void enqueue(int obj) {
		if (rear == arr.length - 1)
			resize();
		arr[rear] = obj;
		rear++;
		if (front == -1) {
			front = 0;
		}
		System.out.println("enqued = " + obj);
	}

	public int dequeue() {
		if (front != rear) {
			int temp = arr[front];
			front++;
//TODO: remove the print out after testing	
			System.out.println("dequee = " + temp);
			return temp;
		}
		System.out.println("Queue is empty");
		return -1;
	}

	public boolean isEmpty() {
		if (rear == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return rear - front;
	}

	private void resize() {
		int[] temp = new int[2 * arr.length];
		System.arraycopy(arr, front, temp, front, rear - front);
		arr = temp;
	}

	public static void main(String[] args) {
		ArrayQueueImpl arrayQueue = new ArrayQueueImpl();

		System.out.println("\nSize of ArrayQueue is : " + arrayQueue.size());
		arrayQueue.enqueue(11);
		arrayQueue.enqueue(12);
		arrayQueue.enqueue(13);
		arrayQueue.enqueue(14);

		System.out.println(arrayQueue.size());

		arrayQueue.dequeue();
		arrayQueue.dequeue();
		System.out.println(arrayQueue.size());
		arrayQueue.dequeue();
		arrayQueue.dequeue();
		System.out.println(arrayQueue.size());
		arrayQueue.dequeue();
		arrayQueue.dequeue();

		arrayQueue.enqueue(99);
		arrayQueue.enqueue(88);
		arrayQueue.enqueue(9);
		arrayQueue.enqueue(8);
		arrayQueue.enqueue(95);
		arrayQueue.enqueue(85);
		
		
		/***
		 * 
		 * 
		 * CONSOLE OUTPUT
		 * ==============
		 * 
		Size of ArrayQueue is : 1
		enqued = 11
		enqued = 12
		enqued = 13
		enqued = 14
		4
		dequee = 11
		dequee = 12
		2
		dequee = 13
		dequee = 14
		0
		Queue is empty
		Queue is empty
		enqued = 99
		enqued = 88
		enqued = 9
		enqued = 8
		enqued = 95
		enqued = 85

		 * 
		 * 
		 */

	}
}
