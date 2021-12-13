package com.github.huston.algorithm.leetcode.list;

import com.github.huston.algorithm.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表: https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @author huxiantao
 * @date 2021-09-01
 */
public class Solution141 {

    /**
     * Set判重
     * 时间 O(n), 空间 O(n)
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode p = head; p != null; p = p.next) {
            if (set.contains(p)) {
                return true;
            }
            set.add(p);
        }
        return false;
    }

    /**
     * 快慢指针
     * 时间 O(n), 空间 O(1)
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        for (ListNode fast = head.next, slow = head; fast != slow; fast = fast.next.next, slow = slow.next) {
            if (fast == null || fast.next == null) {
                return false;
            }
        }
        return true;
    }
}
