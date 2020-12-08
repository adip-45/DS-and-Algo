
public class Main {

	public static void main(String[] args) {
		
		Array arr = new Array(5);
		
		arr.insert(4);
		arr.insert(2);
		arr.insert(7);
		arr.insert(5);
		
		arr.print();
		
		arr.insert(1);
		arr.print();
		arr.insert(6);
		
		System.out.println("position of 7: "+arr.search(7));
		System.out.println("position of 3: "+arr.search(3));
		
		arr.delete(7);
		arr.print();
		arr.insert(6);
		
		arr.print();
		arr.sort();
		arr.print();
		
		/*
		 * LinkedList linkedList = new LinkedList();
		 * 
		 * linkedList.append(14); linkedList.push(3); linkedList.push(7);
		 * linkedList.push(11); linkedList.push(17); linkedList.afterNode(3,234);
		 * linkedList.append(13);
		 * 
		 * linkedList.print();
		 * System.out.println("Before Deletion: "+linkedList.length());
		 * System.out.println("Element found? "+linkedList.search(3));
		 * linkedList.delete(13);
		 * System.out.println("After Deletion: "+linkedList.length());
		 */

	}

}
