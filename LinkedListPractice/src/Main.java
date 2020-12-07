
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
		
		linkedList.print();
		System.out.println("Before Deletion: "+linkedList.length());
		System.out.println("Element found? "+linkedList.search(3));
		linkedList.delete(13);	
		System.out.println("After Deletion: "+linkedList.length());

	}
}
