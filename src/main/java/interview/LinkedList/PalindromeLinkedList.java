package interview.LinkedList;

import java.util.Collections;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2
 * Output: false
 * Example 2:
 * <p>
 * Input: 1->2->2->1
 * Output: true
 */


public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        cut(head, slow);
        return isEqual(head, reverse(slow));
    }

    private ListNode reverse(ListNode l) {
        ListNode head = new ListNode (-1);
        while( l!= null){
            ListNode next = l.next;
            l.next = head.next;
            head.next = l;
            l = next;
        }
        return head.next;
    }

    private boolean isEqual(ListNode head, ListNode slow) {
        while (head != null && slow != null) {
            if(head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private void cut(ListNode head, ListNode slow) {
        ListNode n = head;
        while (n.next != slow) {
            n = n.next;
        }
        n.next = null;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        PalindromeLinkedList list = new PalindromeLinkedList();
        ListNode n = list.reverse(n1);
    }
}
