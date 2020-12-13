
public class Palindrome {

	public boolean palindrome(String str) {

		int endPointer = str.length() - 1;
		int startPointer = 0;

		if (str.equals("")) {
			System.out.println("Empty String");
			return true;
		}
		return isPalindrome(str, startPointer, endPointer);
	}

	private boolean isPalindrome(String str, int startPointer, int endPointer) {

		if (str.charAt(startPointer) != str.charAt(endPointer)) {
			return false;
		}

		if (startPointer > endPointer) {
			return true;
		} else {
			return isPalindrome(str, startPointer + 1, endPointer - 1);
		}
	}

}
