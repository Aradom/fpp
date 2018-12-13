package w3l8.prob3;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {

		if (header == null) {
			header = new Node(null, item, null);
			return;
		}

		Node temp = header;
		while (temp.next != null && temp.value.compareTo(item) < 0) {
			temp = temp.next;
		}
		Node newNode = new Node(null, item, null);
		
		if (temp.value.compareTo(item) > 0) {
			if (temp.previous != null) {
				temp.previous.next = newNode;
				newNode.previous = temp.previous;
				newNode.next = temp;
				temp.previous = newNode;
			} else {
				newNode.next = temp;
				temp.previous = newNode;
				header = newNode;
			}

		} else {
			temp.next = newNode;
			newNode.previous = temp;
		}
	}

	public int size() {
		// Implement
		int sizeOfList = 0;

		Node temp = header;
		while (temp != null) {
			temp = temp.next;
			sizeOfList++;
		}
		return sizeOfList;
	}

	public boolean isEmpty() {
		return header.next == null;
	}

	public Node getFirst() {
		return header;
	}

	public Node getLast() {
		Node temp = header;
		while (temp != null) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean contains(String item) {
		Node temp = header;
		while (temp != null) {
			temp = temp.next;
			if (temp.value.equals(item)) {
				return true;
			}
		}
		return false;
	}

	public void removeFirst() {
		if (header.next == null) {
			header = null;
			return;
		}
		Node temp = header.next;
		temp.previous = null;
		header = temp;
	}

	void removeLast() {
		Node temp = header;
		if (temp.next == null)
			return;

		while (temp != null) {
			temp = temp.next;
		}

		temp.previous.next = null;
		temp = null;
	}

	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		if (n.next == null) {
			System.out.println(n.value.toString());
			return;
		}
		System.out.println(n.value.toString());
		print(n.next);

	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		mySL.addSort("Timbuktu");
		mySL.addSort("New Delhi");
		mySL.addSort("Addis Ababa");
		mySL.addSort("Los Angeles");
		mySL.addSort("Cairo");
		mySL.addSort("Washington");


		System.out.println("List size is : " + mySL.size());
		mySL.print();
		
		
		/**
		 * List size is : 6
			Addis Ababa
			Cairo
			Los Angeles
			New Delhi
			Timbuktu
			Washington
		 * 
		 * 
		 * 
		 */
	}
}
