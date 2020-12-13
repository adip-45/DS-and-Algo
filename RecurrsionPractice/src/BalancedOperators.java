import java.util.Stack;

public class BalancedOperators {

	@SuppressWarnings("unchecked")
	public void balancedOperators(String str) {

		Stack stack = new Stack();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 40 || str.charAt(i) == 41 || str.charAt(i) == 60 || str.charAt(i) == 62
					|| str.charAt(i) == 91 || str.charAt(i) == 93 || str.charAt(i) == 123 || str.charAt(i) == 125) {
				if (str.charAt(i) == '[') {
					System.out.print(str.charAt(i));
					stack.push(']');
				} else if (str.charAt(i) == '{') {
					System.out.print(str.charAt(i));
					stack.push('}');
				} else if (str.charAt(i) == '(') {
					System.out.print(str.charAt(i));
					stack.push(')');
				} else if (str.charAt(i) == '<') {
					System.out.print(str.charAt(i));
					stack.push('>');
				}
			}
		}
		balanceOp(stack);
	}

	private void balanceOp(Stack stack) {

		if (!stack.isEmpty()) {
			char pop = (char) stack.pop();
			System.out.print(pop);
			balanceOp(stack);
		}
	}
}
