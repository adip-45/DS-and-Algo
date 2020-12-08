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
				temp = temp.next;
			}
			System.out.println("END");
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

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

	public Node getMiddle() {
		if(head != null) {
			Node fast = head;
			Node slow = head;
			
			while(slow.next != null && fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			
			return slow;
		}
		return null;
	}
	
	public Node getNFromLast(int n) {
		if(head != null) {
			
			int count = 0;
			
			Node fast = head;
			Node slow = head;
			
			while(fast.next != null) {
				fast = fast.next;
				if(count == n)
					slow = slow.next;
				count++;
			}
			
			return slow;
		}
		
		
		return null;
	}
	
	public boolean checkLoop() {
		boolean loop = false;
		
		if(head != null) {
			
			Node fast = head;
			Node slow = head;
			
			while(slow.next!= null && fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				
				if(fast.equals(slow)) {
					loop = true;
					break;
				}
			}
			
		}
		
		return loop;
	}
	
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