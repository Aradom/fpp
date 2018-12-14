package w3l9.prob1;


interface IStack {
	public void push(Object ob);

	public Object pop();

	public Object peek();

	public boolean isEmpty();

	public int size();
}

class Node {
	Object value;
	Node next;
	Node prev;

	public Node(Node prev, Object value, Node next) {
		this.prev = null;
		this.value = value;
		this.next = null;
	}

	@Override
	public String toString() {
		return this.value.toString();
	}
}

class LinkedStack implements IStack {
	private Node stackHead;
	private int stackSize;

	public LinkedStack(){
		this.stackHead = null;
		this.stackSize = 0;
	}

	public void push(Object item) {
		if (stackHead == null) {
			stackHead = new Node(null, item, null);
			stackSize++;
		} else {
			Node newNode = new Node(null, item, null);
			stackHead.next = newNode;
			newNode.prev = stackHead;
			stackHead = newNode;
			stackSize++;
		}
	}

	// remove an item from top of stack
	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else if (stackHead.prev != null) {
			Node poped = stackHead;
			Node temp = stackHead.prev;
			stackHead = temp;
			stackSize--;
			System.out.println(poped);
			return poped;
		} else {
			Node poped = stackHead;
			stackHead = null;
			System.out.println(poped);
			stackSize--;
			return poped;
		}
	}

	public Object peek() // get top item of stack
	{
		if (isEmpty())
			return null;
		return stackHead;
	}

	public boolean isEmpty() // true if stack is empty
	{
		return stackSize==0;
	}

	public int size() {
		return stackSize;
	}
}

public class LinkedListStack {
	public static void main(String[] args) {
		LinkedStack stk = new LinkedStack();
		Object item;
		stk.pop();
		stk.push('A');
		stk.push('B');
		stk.push('C');
		stk.push(44);
		stk.push("selam");
		System.out.println("Size of the Stack : " + stk.size());

		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		System.out.println(stk.pop() + " is deleted");
		stk.push("Google"); 
		item = stk.peek(); 
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
		item = stk.pop(); 
		item = stk.pop(); 
		stk.pop();
		stk.pop();
		stk.pop();
		
		
		
		/****
		 * Console output
		 * ===============
		 * 
		 * Stack is empty
			Size of the Stack : 5
			selam
			selam is deleted
			44
			44 is deleted
			Google is on top of stack
			Size of the Stack : 4
			Google
			C
			B
			A
			Stack is empty
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
