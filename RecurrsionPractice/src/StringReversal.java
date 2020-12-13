
public class StringReversal {

	public void stringReversal(String str) {

		if ((str == null) || (str.length() <= 1)) {
			System.out.println(str);
		} else {
			if ((str.charAt(str.length() - 1) > 64 && str.charAt(str.length() - 1) < 91)
					|| (str.charAt(str.length() - 1) > 96 && str.charAt(str.length() - 1) < 123)
					|| (str.charAt(str.length() - 1) == 32)) {
				System.out.print(str.charAt(str.length() - 1));
			}
			stringReversal(str.substring(0, str.length() - 1));
		}
	}
}
