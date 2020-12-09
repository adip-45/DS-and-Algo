
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
		if (this.pointer >= this.len) {
			System.out.println("Array is full");
		} else {
			this.arr[pointer] = data;
			pointer++;
		}
	}

	// Insert data at a particular index in the Array
	public void insertIndex(int index, int data) {
		if (this.pointer >= this.len) {
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
		if (this.pointer == 0) {
			System.out.println("Empty Array");
		} else {
			this.arr[pointer - 1] = 0;
		}
		pointer--;

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
		if (i == 0) {
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
		for (i = 0; i < this.pointer; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println("");
	}

	public int[] push(int data, int index) {

		this.pointer = index;

		if (pointer == 0) {
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

}
