package com.wangh.lintcode;

import java.util.ArrayList;
import java.util.List;

public class L_0019_RemoveNthFromEnd {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        //第一个指针先移动 n 步
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        //第一个指针到达终点停止遍历
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd3(ListNode head, int n) {
        List<ListNode> l = new ArrayList<ListNode>();
        ListNode h = head;
        int len = 0;
        while (h != null) {
            l.add(h);
            h = h.next;
            len++;
        }
        if (len == 1) {
            return null;
        }
        int remove = len - n;
        if (remove == 0) {
            return head.next;
        }
        //直接得到，不需要再遍历了
        ListNode r = l.get(remove - 1);
        r.next = r.next.next;
        return head;
    }

}
