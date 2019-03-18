package leetCode.practice;

//https://leetcode.com/problems/add-two-numbers/submissions/
// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumber {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int first = l1.val + l2.val;
		int extra = first / 10;
		first %= 10;
		
		ListNode result = new ListNode(first);
		ListNode nextResult = result;
		int x = 0, y = 0;
		while (l1.next != null || l2.next != null) {
			if (l1.next != null) {
				l1 = l1.next;
				x = l1.val;
			} else {
				x = 0;
			}
			if (l2.next != null) {
				l2 = l2.next;
				y = l2.val;
			} else {
				y = 0;
			}
			
			nextResult.next = new ListNode((x + y + extra) % 10);
			extra = (x + y + extra) / 10 ;
			nextResult = nextResult.next;
		}
		if (extra == 1) {
			nextResult.next = new ListNode(1); 
		}
		return result;
	}

//	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	Output: 7 -> 0 -> 8
//	Explanation: 342 + 465 = 807.
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(5);
//		l1.next = new ListNode(4);
//		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
		
		ListNode result = addTwoNumbers(l1, l2);
		
		System.out.print(result.val + " ");
		
		while (result.next != null) {
			result = result.next;
			System.out.print(result.val + " ");
		}
		
	}
}