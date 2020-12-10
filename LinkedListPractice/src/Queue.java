
public class Queue {
	
	private LinkedList queue;
	
	Queue(){
		this.queue = new LinkedList();
	}

	// Enqueue a value in Queue
	public void enqueue(int data) {
		queue.enqueue(data);
	}

	// Dequeue a value from Queue
	public void dequeue() {
		if(queue.dequeue() == -1) {
			System.out.println("Underflow Condition");
		}else {
			System.out.println(queue.dequeue());
		}
	}

	// Get front value of Queue
	public void front() {
		int result = queue.front();

		if (result == -1) {
			System.out.println("Empty Queue");
		} else {
			System.out.println(result);
		}
	}
	
	// Get last value of Queue
	public void rear() {
		int result = queue.rear();

		if (result == -1) {
			System.out.println("Empty Queue");
		} else {
			System.out.println(result);
		}
	}
	
	// Print Queue
	public void print() {
		queue.print();
	}
}
