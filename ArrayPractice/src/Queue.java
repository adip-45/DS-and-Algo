
public class Queue {

	private Array queue;

	public Queue(int size) {
		this.queue = new Array(size);
	}

	public void enqueue(int data) {

		if (queue.isFull()) {
			System.out.println("Queue is Full");
		} else {
			this.queue.insert(data);
		}
	}

	public void dequeue() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			queue.deleteIndex(0);
		}
	}

	public void front() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(this.queue.front());
		}

	}

	public void rear() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(this.queue.rear());
		}
	}

	public void print() {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			this.queue.print();
		}
	}

}
