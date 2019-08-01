package com.wangh.lintcode;

import java.util.*;

public class L_0023_MergeKLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeKLists1(ListNode[] lists) {
        List<Integer> l = new ArrayList<Integer>();
        //存到数组
        for (ListNode ln : lists) {
            while (ln != null) {
                l.add(ln.val);
                ln = ln.next;
            }
        }
        //数组排序
        Collections.sort(l);
        //存到链表
        ListNode head = new ListNode(0);
        ListNode h = head;
        for (int i : l) {
            ListNode t = new ListNode(i);
            h.next = t;
            h = h.next;
        }
        h.next = null;
        return head.next;
    }

    public static ListNode mergeKLists2(ListNode[] lists) {
        int min_index = 0;
        ListNode head = new ListNode(0);
        ListNode h = head;
        while (true) {
            boolean isBreak = true;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < min) {
                        min_index = i;
                        min = lists[i].val;
                    }
                    isBreak = false;
                }

            }
            if (isBreak) {
                break;
            }
            //最小的节点接过来
            h.next = lists[min_index];
            h = h.next;
            lists[min_index] = lists[min_index].next;
        }
        h.next = null;
        return head.next;
    }

    public static ListNode mergeKLists3(ListNode[] lists) {
        //定义优先队列的比较器
        Comparator<ListNode> cmp;
        cmp = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                // TODO Auto-generated method stub
                return o1.val - o2.val;
            }
        };

        //建立队列
        Queue<ListNode> q = new PriorityQueue<>(cmp);
        for (ListNode l : lists) {
            if (l != null) {
                q.add(l);
            }
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while (!q.isEmpty()) {
            //出队列
            point.next = q.poll();
            point = point.next;
            //判断当前链表是否为空，不为空就将新元素入队
            ListNode next = point.next;
            if (next != null) {
                q.add(next);
            }
        }
        return head.next;
    }

    public static ListNode mergeTwoLists4(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode ans = h;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                h.next = l1;
                h = h.next;
                l1 = l1.next;
            } else {
                h.next = l2;
                h = h.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            h.next = l2;
        }
        if (l2 == null) {
            h.next = l1;
        }
        return ans.next;
    }

    public static ListNode mergeKLists4(ListNode[] lists) {
        if (lists.length == 1) {
            return lists[0];
        }
        if (lists.length == 0) {
            return null;
        }
        ListNode head = mergeTwoLists4(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            head = mergeTwoLists4(head, lists[i]);
        }
        return head;
    }

    public static ListNode mergeTwoLists5(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode ans = h;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                h.next = l1;
                h = h.next;
                l1 = l1.next;
            } else {
                h.next = l2;
                h = h.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            h.next = l2;
        }
        if (l2 == null) {
            h.next = l1;
        }
        return ans.next;
    }

    public static ListNode mergeKLists5(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        int interval = 1;
        while (interval < lists.length) {
            System.out.println(lists.length);
            for (int i = 0; i + interval < lists.length; i = i + interval * 2) {
                lists[i] = mergeTwoLists5(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return lists[0];
    }

}
