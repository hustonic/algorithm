package com.huston.algorithm.common;

/**
 * @author huxiantao
 * @date 2021-08-31
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... array) {
        ListNode head = null;
        ListNode pre = null;
        ListNode cur;
        for (int a : array) {
            if (head == null) {
                pre = head = new ListNode(a);
            } else {
                cur = new ListNode(a);
                pre.next = cur;
                pre = cur;
            }
        }
        return head;
    }

    public boolean isEqualsTo(ListNode anotherList) {
        ListNode p1 = this;
        ListNode p2 = anotherList;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val || ((p1.next == null || p2.next == null) && p1.next != p2.next)) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static boolean equals(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2 == null;
        }
        return list1.isEqualsTo(list2);
    }
}
