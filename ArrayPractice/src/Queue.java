
public class Queue {

	private Array queue;

	public Queue(int size) {
		this.queue = new Array(size);
	}

	// Enqueue a value in Queue
	public void enqueue(int data) {

		if (queue.isFull()) {
			System.out.println("Queue is Full");
		} else {
			this.queue.insert(data);
		}
	}

	// Dequeue a value from Queue
	public void dequeue() {
		if (queue.isEmpty()) {
			System.out.println("Underflow Condition");
		} else {
			System.out.println(queue.deleteIndex(0));
		}
	}

	// Get front value of Queue
	public void front() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(this.queue.front());
		}

	}

	// Get last value of Queue
	public void rear() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(this.queue.rear());
		}
	}

	// Print Queue
	public void print() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			this.queue.print();
		}
	}

}
