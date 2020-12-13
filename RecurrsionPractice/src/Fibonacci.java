
public class Fibonacci {

	public int[] fibonacci(int num) {

		if (num < 0) {
			int[] arr = null;
			System.out.println("Invalid Argument");
			return arr;
		}
		
		int[] arr = new int[num+2];
		
		arr[0]=1;
		arr[1]=2;
		
		int pointer = 2;

		if (num == 0) {
			return arr;
		} else
			return calculateFibonacci(num, arr, pointer);
	}

	private int[] calculateFibonacci(int num, int[] arr, int pointer) {

		if (pointer < num + 2) {
			arr[pointer] = arr[pointer - 1] + arr[pointer - 2];
			return calculateFibonacci(num, arr, pointer + 1);
		} else {
			return arr;
		}
	}

}
