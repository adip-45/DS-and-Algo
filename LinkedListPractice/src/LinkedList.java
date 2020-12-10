
public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	// Traverse and print the Linked List
	public void print() {
		if (this.head != null) {
			Node temp = this.head;
			System.out.print("START --> ");

			while (temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
			System.out.println("END");
		}
	}

	// Add a node at the start of the Linked List
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	// Add a node in the end of the Linked List
	public void append(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {

			Node temp = this.head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Find the length of the Linked List
	public int length() {

		int count = 0;

		if (this.head != null) {
			Node temp = this.head;

			while (temp != null) {
				temp = temp.next;
				count++;
			}
		}
		return count;
	}

	// Search a node in the Linked List
	public boolean search(int data) {
		if (this.head != null) {
			Node temp = this.head;
			while (temp != null) {
				if (temp.data == data) {
					return true;
				}
				temp = temp.next;
			}
		} else {
			System.out.println("Empty LinkedList");
		}
		return false;
	}

	// Add node after a particular node in the Linked List
	public void afterNode(int nodeData, int data) {

		Node newNode = new Node(data);

		if (this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node temp = this.head;
			while (temp != null) {
				if (temp.data == nodeData) {
					newNode.next = temp.next;
					temp.next = newNode;
				}

				temp = temp.next;
			}
		}
	}

	// Delete a node in the Linked List
	public void delete(int data) {

		boolean status = search(data);

		if (status) {
			if (this.head == null) {
				System.out.println("Empty Linked List");
			} else {
				Node temp = this.head;
				while (temp != null) {
					if (temp.next != null && temp.next.data == data) {
						temp.next = temp.next.next;
						break;
					}

					if (this.head.data == data) {
						this.head = this.head.next;
					}

					temp = temp.next;
				}
			}

		} else
			System.out.println("Record not found");
	}

	// Find the Nth Node in the Linked list
	public void getNode(int num) {

		int count = 1;

		if (this.head != null) {
			Node temp = this.head;

			while (count < num) {
				temp = temp.next;
				count++;
			}
			System.out.println(temp.data);
		} else {
			System.out.println("Empty Linked List");
		}
	}

	// Find middle node of the Linked List
	public Node getMiddle() {
		if (head != null) {
			Node fast = head;
			Node slow = head;

			while (slow.next != null && fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}

			return slow;
		}
		return null;
	}

	// Find Nth node from last in the Linked List
	public Node getNFromLast(int n) {
		if (head != null) {

			int count = 0;

			Node fast = head;
			Node slow = head;

			while (fast.next != null) {
				fast = fast.next;
				if (count == n)
					slow = slow.next;
				count++;
			}

			return slow;
		}

		return null;
	}

	// Check if loop is present in the Linked List
	public boolean checkLoop() {
		boolean loop = false;

		if (head != null) {

			Node fast = head;
			Node slow = head;

			while (slow.next != null && fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;

				if (fast.equals(slow)) {
					loop = true;
					break;
				}
			}

		}
		return loop;
	}

	// Check is Linked List is Empty
	public boolean isEmpty() {
		boolean status = false;
		if (this.head == null) {
			status = true;
		}
		return status;
	}

	// Enqueue a message in Queue
	public void enqueue(int data) {

		Node newNode = new Node(data);

		if (isEmpty()) {
			this.head = newNode;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Dequeue a message in the queue
	public int dequeue() {
		if (isEmpty()) {
			return -1; 
		} else {
			int data = this.head.data;
			this.head = this.head.next;
			return data;
		}
	}

	//Get front element in the Queue
	public int front() {
		if (isEmpty()) {
			return -1;
		} else {
			return this.head.data;
		}
	}

	//Get last element in the queue
	public int rear() {

		Node temp = this.head;

		if (isEmpty()) {
			return -1;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp.data;
		}
	}

	// Node class
	static class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node nextNode) {
			this.next = nextNode;
		}

	}
}