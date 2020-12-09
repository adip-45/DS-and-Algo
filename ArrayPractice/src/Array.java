
public class Array {

	private int arr[];
	private int i = 0;
	private int len = 0;
	private int pointer;

	// Create Array of size "N"
	public Array(int size) {
		this.arr = new int[size];
		this.len = size;
		this.pointer = 0;
	}

	// Insert Data at the end of the Array
	public void insert(int data) {
		if (isFull()) {
			System.out.println("Array is full");
		} else {
			this.arr[pointer] = data;
			this.pointer++;
		}
	}

	// Insert data at a particular index in the Array
	public void insertIndex(int index, int data) {
		if (isFull()) {
			System.out.println("Array is full");
		} else {
			int count = this.pointer;
			while (count > index) {
				this.arr[count] = this.arr[count - 1];
				count--;
			}
			arr[index] = data;
			this.pointer++;
		}
	}

	// Delete last element of the Array
	public void delete() {
		if (isEmpty()) {
			System.out.println("Empty Array");
		} else {
			this.arr[pointer - 1] = 0;
		}
		this.pointer--;

	}

	// Delete element at a particular index in the Array
	public void deleteIndex(int index) {
		while (index < this.pointer - 1) {
			this.arr[index] = this.arr[index + 1];
			index++;
		}
		arr[index] = 0;
		this.pointer--;
	}

	// Search a particular data in the Array
	public int search(int data) {
		if (this.pointer == 0) {
			return -1;
		}

		for (i = 0; i < this.pointer; i++) {
			if (this.arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	// Bubble Sort
	public int[] sort() {
		if (isEmpty()) {
			System.out.println("Empty Array");
		} else {
			for (i = 0; i < this.pointer; i++) {
				for (int j = 0; j < this.pointer - 1; j++) {
					if (this.arr[j] > this.arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}
		return this.arr;
	}

	// Traverse and print the Array
	public void print() {

		if (isEmpty()) {
			System.out.println("Array is Empty");
		}
		for (i = 0; i < this.pointer; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println("");
	}

	// Push data on stack
	public int[] push(int data) {

		if (this.pointer == 0) {
			this.arr[0] = data;
			this.pointer++;
		} else {
			for (int i = this.pointer; i > 0; i--) {
				this.arr[i] = this.arr[i - 1];
			}
			this.arr[0] = data;
			this.pointer++;
		}
		return arr;
	}

	// Pop data from Stack
	public int pop() {

		int value = 0;

		if (this.pointer == 0) {
			value = this.arr[0];
		} else {
			value = this.arr[0];
			for (int i = 0; i < this.pointer - 1; i++) {
				arr[i] = arr[i + 1];
			}
			this.pointer--;
		}
		return value;
	}

	// Get the top value of Stack
	public int top() {
		return this.arr[0];

	}

	//Get the front element of Queue
	public int front() {
		return this.arr[0];
	}

	//Get the last element of Queue
	public int rear() {
		return this.arr[this.pointer - 1];
	}

	// Check is Array is Empty
	public boolean isEmpty() {

		boolean status = false;

		if (this.pointer == 0) {
			status = true;
		}
		return status;
	}

	// Check if Array is Full
	public boolean isFull() {

		boolean status = false;

		if (this.pointer >= this.len) {
			status = true;
		}
		return status;
	}

}
