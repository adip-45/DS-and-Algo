
public class Occurrences {

	public int occurrences(String str, char occur) {

		int count = 0;
		int pointer = 0;

		if (str.equals("")) {
			System.out.println("Empty String");
			return count;
		}

		count = countOccurrences(str, count, pointer, occur);

		return count;
	}

	private int countOccurrences(String str, int pointer, int count, char occur) {

		if (str.charAt(pointer) == occur) {
			count++;
		}

		if (pointer < str.length() - 1) {
			return countOccurrences(str, pointer + 1, count, occur);
		} else
			return count;
	}
}
