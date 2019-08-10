package com.wangh.leetcode.p0001_0100;

public class L_0025_ReverseKGroup {
    public static void main(String[] args) {

    }

    public static ListNode reverseKGroup1(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode sub_head = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;
        ListNode toNull = head;
        while (sub_head != null) {
            int i = k;
            //找到子链表的尾部
            while (i - 1 > 0) {
                toNull = toNull.next;
                if (toNull == null) {
                    return dummy.next;
                }
                i--;
            }
            ListNode temp = toNull.next;
            //将子链表断开
            toNull.next = null;
            ListNode new_sub_head = reverse(sub_head);
            //将倒置后的链表接到 tail 后边
            tail.next = new_sub_head;
            //更新 tail
            tail = sub_head; //sub_head 由于倒置其实是新链表的尾部
            sub_head = temp;
            toNull = sub_head;
            //将后边断开的链表接回来
            tail.next = sub_head;
        }
        return dummy.next;
    }

    public static ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode point = head;
        //找到子链表的尾部
        int i = k;
        while (i - 1 > 0) {
            point = point.next;
            if (point == null) {
                return head;
            }
            i--;
        }
        ListNode temp = point.next;
        //将子链表断开
        point.next = null;

        //倒置子链表，并接受新的头结点
        ListNode new_head = reverse(head);

        //head 其实是倒置链表的尾部，然后我们将后边的倒置结果接过来就可以了
        //temp 是链表断开后的头指针，可以参考解法一的图示
        head.next = reverseKGroup2(temp, k);
        return new_head;
    }

    public static ListNode reverse(ListNode head) {
        ListNode current_head = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = current_head;
            current_head = head;
            head = next;
        }
        return current_head;
    }

}
