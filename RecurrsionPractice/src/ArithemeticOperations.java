
public class ArithemeticOperations {

	public void arithemeticOperations(int num1, int num2, int out) {

		checkOperator(num1, num2, out, 0);

	}

	private void checkOperator(int num1, int num2, int out, int pointer) {

		char[] operators = { '+', '-', '*', '/' };

		if (pointer < 4) {
			switch (operators[pointer]) {
			case '+':
				if (num1 + num2 == out) {
					if( num2 == 0) {
						System.out.println(num1 + " + " + num2 + " = " + out);
						System.out.println(num1 + " - " + num2 + " = " + out);
					}else
						System.out.println(num1 + " + " + num2 + " = " + out);
					break;
				} else {
					pointer++;
					checkOperator(num1, num2, out, pointer);
					break;
				}

			case '-':
				if (num1 - num2 == out) {
					System.out.println(num1 + " - " + num2 + " = " + out);
					break;
				} else if (num2 - num1 == out) {
					System.out.println(num2 + " - " + num1 + " = " + out);
					break;
				} else {
					pointer++;
					checkOperator(num1, num2, out, pointer);
					break;
				}

			case '*':
				if (num1 * num2 == out) {
					if (num2 == 1) {
						System.out.println(num1 + " * " + num2 + " = " + out);
						System.out.println(num1 + " / " + num2 + " = " + out);
					} else
						System.out.println(num1 + " * " + num2 + " = " + out);
					break;
				} else {
					pointer++;
					checkOperator(num1, num2, out, pointer);
					break;
				}

			case '/':
				if ((float) num1 / (float) num2 == (float) out) {
					System.out.println((float) num1 + " / " + (float) num2 + " = " + (float) out);
					break;
				} else if ((float) num2 / (float) num1 == (float) out) {
					System.out.println((float) num2 + " / " + (float) num1 + " = " + (float) out);
					break;
				} else {
					pointer++;
					checkOperator(num1, num2, out, pointer);
					break;
				}

			}
		} else {
			System.out.println("Not a valid Equation");
		}
	}

}
