
public class Main {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		linkedList.append(14);
		linkedList.push(3);		
		linkedList.push(7);
		linkedList.push(11);
		linkedList.push(17);
		linkedList.appendAfterNodeData(3,234);
		linkedList.append(13);
		
		System.out.println(linkedList.length());	
		System.out.println(linkedList.search(3));

		linkedList.print();

	}
}
