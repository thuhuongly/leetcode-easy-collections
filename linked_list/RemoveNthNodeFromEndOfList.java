/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int size = 1;
		ListNode cur = head;
		ListNode prev = head;
		while (cur.next != null) {
			cur = cur.next;
			size++;
			if (size > n + 1)
				prev = prev.next;
		}
		if (size == n)
			return head.next;
		else {
			prev.next = prev.next.next;
			return head;
		}
	}
}