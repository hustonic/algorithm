package com.github.huston.algorithm.leetcode.list;

import com.github.huston.algorithm.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II: https://leetcode-cn.com/problems/linked-list-cycle-ii/
 *
 * @author huxiantao
 * @date 2021-09-02
 */
public class Solution142 {

    /**
     * Hash表法
     * 时间 O(n), 空间 O(n)
     */
    public ListNode detectCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode p = head; p != null; p = p.next) {
            if (set.contains(p)) {
                return p;
            }
            set.add(p);
        }
        return null;
    }

    /**
     * 双指针
     * 时间 O(n), 空间 O(1)
     */
    public ListNode detectCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode p = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        while (p != slow) {
            slow = slow.next;
            p = p.next;
        }
        return p;
    }
}
