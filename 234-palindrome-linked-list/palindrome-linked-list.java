/* method -  1 using extra space
class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode forward = null;
        ListNode curr = head;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(1);
        ListNode dummyTail = dummy;
        ListNode p1 = head;

        while (p1 != null) {
            dummyTail.next = new ListNode(p1.val);
            dummyTail = dummyTail.next;
            p1 = p1.next;
        }

        p1 = head;
        ListNode dummyHead = dummy.next;
        ListNode p2 = reverse(dummyHead);

        while (p1 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}*/

/* method - 2 using inplace logic */
class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode forward = null;
        ListNode curr = head;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;

        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
