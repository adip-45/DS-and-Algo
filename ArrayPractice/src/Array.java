import java.util.Arrays;

public class Array {

	private int arr[];
	private int i = 0;
	private int len = 0;

	public Array(int size) {
		this.arr = new int[size];
		this.len = size;
	}

	public void insert(int data) {
		if (i >= this.len) {
			System.out.println("Array is full");
		} else {
			this.arr[i] = data;
			i++;
		}
	}

	public void insertIndex(int index, int data) {
		if (i >= this.len) {
			System.out.println("Array is full");
		} else {
			while (i > index) {
				this.arr[i] = this.arr[i - 1];
				i--;
			}
			arr[index] = data;
		}
	}

	public void delete() {
		if (i == 0) {
			System.out.println("Empty Array");
		} else {
			this.arr[i - 1] = 0;
		}

	}

	public void deleteIndex(int index) {
		while (index < this.len - 1) {
			this.arr[index] = this.arr[index + 1];
			index++;
		}
		arr[index] = 0;
	}

	public int search(int data) {
		if (i == 0) {
			return -1;
		}
		for (int i = 0; i < this.len; i++) {
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
			for (i = 0; i < this.len; i++) {
				for (int j = 0; j < this.len - 1; j++) {
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
		System.out.println(Arrays.toString(this.arr));
	}

}
