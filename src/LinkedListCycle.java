import java.awt.*;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null || head.next== head) return false;
        ListNode slow = head.next;
        ListNode fast = head;

        while (fast != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;

    }


    public static void main(String[] args) {
        ListNode list = new ListNode(-21);
        list.next = new ListNode(10);
        list.next.next = new ListNode(17);
        list.next.next.next = new ListNode(8);
        //list.next.next.next = list.next;
        ListNode list2 = new ListNode(4);
        System.out.println(hasCycle(list2));
        System.out.println(-8%6);

    }

}