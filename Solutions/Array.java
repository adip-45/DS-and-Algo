
public class Array {

	private Integer[] arr;
	private int length;
	private int pointer;

	public Array(int length) {
		this.length = length;
		this.arr = new Integer[length];
		this.pointer = -1;
	}

	public void insert(Integer num) {
		if (isFull()) {
			System.out.println("Array is full");
			return;
		}
		this.arr[pointer + 1] = num;
		pointer++;
	}

	// returns position
	public int search(Integer num) {
		if (isEmpty()) {
			return -1;
		}
		for (int i = 0; i <= this.pointer; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public void delete(Integer num) {
		if (isEmpty()) {
			return;
		}
		int pos = search(num);
		if (pos != -1) {
			if (pos == this.pointer) {
				arr[pos] = null;
				this.pointer--;
			} else {
				for (int i = pos; i < this.pointer; i++) {
					arr[i] = arr[i + 1];
				}
				arr[this.pointer] = null;
				this.pointer--;
			}
		}
	}

	//bubble sort
	public void sort() {
		if (isEmpty()) {
			return;
		}
		for (int i = 0; i <= this.pointer; i++) {
			for (int j = 0; j < this.pointer; j++) {
				if (arr[j] > arr[j+1]) {
					swap(j, j+1);
				}
			}
		}

	}

	public void print() {
		if (isEmpty()) {
			return;
		}
		for (int i = 0; i <= this.pointer; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println("");
	}

	private void swap(int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	private boolean isEmpty() {
		if (this.pointer == -1) {
			return true;
		}
		return false;
	}

	private boolean isFull() {
		if (this.pointer == this.length - 1) {
			return true;
		}
		return false;
	}
}
