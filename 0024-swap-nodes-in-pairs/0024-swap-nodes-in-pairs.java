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

/**
 * Algorithm:
 1. Create a dummy node pointing to the head of the list.
 2. Initialize a pointer current at the dummy node.
 3. While there are at least two more nodes:
 4. Identify the first and second nodes to swap.
 5. Swap their pointers so that second points to first, and first points to the node after second.
 6. Update current.next to point to second.
 7. Move current forward to first.
 8. Return dummy.next as the new head.
 */


class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = first;
        }

        return dummy.next;
    }
}
