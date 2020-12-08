import java.util.Arrays;

public class Array {

	private int arr[];
	private int i = 0;
	private int len = 0;
	private int pointer;

	public Array(int size) {
		this.arr = new int[size];
		this.len = size;
	}

	public void insert(int data) {
		if (pointer >= this.len) {
			System.out.println("Array is full");
		} else {
			this.arr[pointer] = data;
			pointer++;
		}
	}

	public void insertIndex(int index, int data) {
		if (pointer >= this.len) {
			System.out.println("Array is full");
		} else {
			int count = pointer;
			while (count > index) {
				this.arr[count] = this.arr[count - 1];
				count--;
			}
			arr[index] = data;
			pointer++;
		}
	}

	public void delete() {
		if (pointer == 0) {
			System.out.println("Empty Array");
		} else {
			this.arr[pointer - 1] = 0;
		}
		pointer--;

	}

	public void deleteIndex(int index) {
		while (index < pointer - 1) {
			this.arr[index] = this.arr[index + 1];
			index++;
		}
		arr[index] = 0;
		pointer--;
	}

	public int search(int data) {
		if (pointer == 0) {
			return -1;
		}

		for (i = 0; i < this.pointer; i++) {
			if (this.arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	public int[] sort() {
		if (i == 0) {
			System.out.println("Empty Array");
		} else {
			for (i = 0; i < pointer; i++) {
				for (int j = 0; j < pointer - 1; j++) {
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

	public void print() {
		for (i = 0; i < pointer; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println("");
	}

}
