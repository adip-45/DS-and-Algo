
public class StringReversal {

	public void stringReversal(String str) {

		if ((str == null) || (str.length() <= 1)) {
			System.out.println(str);
		} else {
			System.out.println(str.charAt(str.length() - 1));
			stringReversal(str.substring(0, str.length() - 1));
		}
	}
}
