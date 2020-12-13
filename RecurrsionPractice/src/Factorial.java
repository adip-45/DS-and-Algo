
public class Factorial {

	public int factorial(int num) {

		if (num == 0) {
			return 1;
		} else
			return fac(num);
	}

	private int fac(int num) {
		if (num > 1) {
			return num * fac(num - 1);
		} else
			return 1;
	}

}
