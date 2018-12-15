package w3l10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import day2.backup.MyStringLinkedListBackup.Node;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	int sizeOfBTree = 0, numberOfLeaf = 0; // TODO: Aradom added

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. In order
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			sizeOfBTree++;
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
						sizeOfBTree++;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
						sizeOfBTree++;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}
		}
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	// TODO: Aradom implementations

	public void preOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + ",");
			printTree(t.left);
			printTree(t.right);
		}
	}

	public void postOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			printTree(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean contains(Integer key) {
		if (root == null) {
			return false;
		} else {
			return contains(key, root);
		}
	}

	private boolean contains(Integer key, BinaryNode bNode) {
		if (bNode == null) {
			return false;
		} else {
			BinaryNode n = root;

			while (true) {
				if (key.compareTo(n.element) < 0) {
					// not found on the left
					if (n.left == null) {
						return false;
					}
					// keep looking in the left
					else {
						n = n.left;
					}
				} else if (key.compareTo(n.element) > 0) {
					// not found on the right
					if (n.right == null) {
						return false;
					}
					// keep looking in the right direction
					else {
						n = n.right;
					}
				}
				// if a node already exists
				else {
					return true;
				}

			}

		}
	}

	int countLeaf() {
		return countLeaf(root);
	}

	private int countLeaf(BinaryNode t) {
		if (t != null) {
			countLeaf(t.left);
			countLeaf(t.right);

			if (t.left == null && t.right == null) {
//	TODO: for debugging only	System.out.println("This is leaf: " + t.element);
				numberOfLeaf++;
			}
		}
		return numberOfLeaf;
	}

	public int size() {
		return sizeOfBTree;
	}

	public Integer findMin() {
		if (root == null) {
			return null;
		} else {
			return findMin(root);
		}
	}

	private Integer findMin(BinaryNode t) {
		BinaryNode temp = t;
		while (true) {
			if (temp.left != null) {
				temp = temp.left;
			} else {
				break;
			}
		}
		return temp.element;
	}

	public Integer findMax() {
		return findMax(root);
	}

	public Integer findMax(BinaryNode t) {
		BinaryNode temp = t;
		while (true) {
			if (temp.right != null) {
				temp = temp.right;
			} else {
				break;
			}
		}
		return temp.element;

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}

		System.out.println("\n minimum element of the BST is : " + mybst.findMin());

		System.out.println("\n Maximum element of the BST is : " + mybst.findMax());

		// Aradom Tests

		System.out.println(mybst.contains(19));
		System.out.println(mybst.contains(94));

		// TODO: remove this later. End of Aradom Test

		mybst.insert(12);
		mybst.printTree();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

		System.out.println("-----------------");
		mybst.printTree();
	}
}
