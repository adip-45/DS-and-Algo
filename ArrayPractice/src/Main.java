import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array arr = new Array(5);
		
		arr.insert(5);
		arr.insert(7);
		arr.insert(11);
		arr.insert(1);
		arr.insert(17);
		arr.print();
		arr.deleteIndex(2);
		arr.print();
		arr.insertIndex(1, 4);
		arr.print();
		System.out.println(arr.search(7));
		System.out.println(Arrays.toString(arr.sort()));

	}

}
