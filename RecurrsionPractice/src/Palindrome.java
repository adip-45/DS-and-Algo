
public class Palindrome {

	public boolean palindrome(String str) {

		boolean check = false;

		if(str.equals("")) {
			System.out.println("Empty String");
		}
		
		int endPointer = str.length() - 1;
		int startPointer = 0;

		if (startPointer == endPointer) {
			check = true;
		} else {
			check = isPalindrome(str, startPointer, endPointer);
		}

		return check;
	}

	private boolean isPalindrome(String str, int startPointer, int endPointer) {

		int i = 0;
		boolean status = true;
		
		while (i < (str.length()/2)) {
			if (str.charAt(startPointer) != str.charAt(endPointer)) {
				status = false;
			}			
			startPointer++;
			endPointer--;
			i++;
		}
		
		return status;
	}

}
