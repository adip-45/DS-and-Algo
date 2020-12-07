public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public void print() {
		if (this.head != null) {
			Node temp = this.head;
			System.out.print("START --> ");
			
			while (temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.nextNode;
			}
			System.out.println("END");
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.nextNode = this.head;
		this.head = newNode;
	}

	public void append(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {

			Node temp = this.head;

			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = newNode;
		}
	}

	public int length() {

		int count = 0;

		if (this.head != null) {
			Node temp = this.head;

			while (temp != null) {
				temp = temp.nextNode;
				count++;
			}
		}
		return count;
	}

	public boolean search(int data) {
		if (this.head != null) {
			Node temp = this.head;
			while (temp != null) {
				if (temp.data == data) {
					return true;
				}
				temp = temp.nextNode;
			}
		} else {
			System.out.println("Empty LinkedList");
		}
		return false;
	}

	public void appendAfterNodeData(int nodeData, int data) {

		Node newNode = new Node(data);

		if (this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node temp = this.head;
			while (temp != null) {
				if (temp.data == nodeData) {
					newNode.nextNode = temp.nextNode;
					temp.nextNode = newNode;
				}

				temp = temp.nextNode;
			}
		}
	}

	public void delete(int data) {

		boolean status = search(data);

		if (status) {
			if (this.head == null) {
				System.out.println("Empty Linked List");
			} else {
				Node temp = this.head;
				while (temp != null) {
					if (temp.nextNode != null && temp.nextNode.data == data) {
						temp.nextNode = temp.nextNode.nextNode;
						break;
					}

					if (this.head.data == data) {
						this.head = this.head.nextNode;
					}

					temp = temp.nextNode;
				}
			}

		} else
			System.out.println("Record not found");
	}

	static class Node {

		private int data;
		private Node nextNode;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

	}

}