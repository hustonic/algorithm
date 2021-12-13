package com.github.huston.algorithm.leetcode.list;

import com.github.huston.algorithm.common.ListNode;

/**
 * 24. 两两交换链表中的节点: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 *
 * @author huxiantao
 * @date 2021-08-27
 */
public class Solution24 {

    /**
     * 迭代法
     * 时间 O(n), 空间 O(1)
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        if (head.next != null) {
            head = head.next;
        }
        while (cur != null && cur.next != null) {
            ListNode next = cur.next;
            if (pre != null) {
                pre.next = next;
            }
            cur.next = next.next;
            next.next = cur;

            pre = cur;
            cur = cur.next;
        }
        return head;
    }

    /**
     * 递归法
     * 时间 O(n), 空间 O(n)
     */
    public ListNode swapPairsRecursive(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        if (head.next != null) {
            head = head.next;
        }
        recursion(null, cur);
        return head;
    }

    private void recursion(ListNode pre, ListNode cur) {
        if (cur == null || cur.next == null) {
            return;
        }
        ListNode next = cur.next;
        if (pre != null) {
            pre.next = next;
        }
        cur.next = next.next;
        next.next = cur;
        recursion(cur, cur.next);
    }
}
