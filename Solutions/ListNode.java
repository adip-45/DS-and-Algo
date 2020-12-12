///**
// * Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;
		else {
			return add(l1, l2, 0); // add(l1,l2);
		}

	}

	// recursive
	private ListNode add(ListNode l1, ListNode l2, int carry) {
		if (l1 == null && l2 == null) {
			if (carry == 0)
				return null;
			else
				return new ListNode(carry, null);
		} else {
			int val1 = 0, val2 = 0, sum = 0;
			ListNode l1Next = null, l2Next = null;

			if (l1 != null) {
				val1 = l1.val;
				l1Next = l1.next;
			}

			if (l2 != null) {
				val2 = l2.val;
				l2Next = l2.next;
			}

			sum = val1 + val2 + carry;
			carry = 0;

			if (sum > 9) {
				sum = sum % 10;
				carry = 1;
			}

			ListNode result = new ListNode(sum, null);
			result.next = add(l1Next, l2Next, carry);

			return result;
		}
	}

	// iterative
	private ListNode add(ListNode l1, ListNode l2) {
		
		int sum = 0, carry = 0;
		int val1 = 0, val2 = 0;
		ListNode result = new ListNode();
		ListNode temp = result;

		while (l1 != null || l2 != null) {

			if (l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			}

			sum = val1 + val2 + carry;
			carry = 0;
			val1 = 0;
			val2 = 0;

			if (sum > 9) {
				sum = sum % 10;
				carry = 1;
			}

			if (temp == null) {
				temp = new ListNode(sum, null);
				result = temp;
			} else {
				temp.next = new ListNode(sum, null);
				temp = temp.next;
			}
		}

		if (carry != 0) {
			temp.next = new ListNode(carry, null);
		}

		return result;
	}
}