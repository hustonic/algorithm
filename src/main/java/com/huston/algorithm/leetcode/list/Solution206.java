package com.huston.algorithm.leetcode.list;

import com.huston.algorithm.common.ListNode;

/**
 * 206. 反转链表: https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author huxiantao
 * @date 2021-08-27
 */
public class Solution206 {
    /**
     * 迭代
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 递归
     */
    public ListNode reverseList1(ListNode head) {
        return recurse(null, head);
    }

    public ListNode recurse(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }
        ListNode next = cur.next;
        cur.next = pre;
        return recurse(cur, next);
    }
}