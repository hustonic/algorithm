package com.github.huston.algorithm.leetcode.list;

import com.github.huston.algorithm.common.ListNode;

/**
 * 25. K 个一组翻转链表: https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 * hard
 *
 * @author huxiantao
 * @date 2021-09-02
 */
public class Solution25 {

    /**
     * 时间 O(n), 空间 O(1)
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head;
        ListNode pre = null;
        ListNode currentHead = head;
        ListNode lastEnd = null;
        int i = 0;
        boolean isFirstGroup = true;

        while (p != null) {
            //翻转子链表
            ListNode next = p.next;
            p.next = pre;
            pre = p;
            p = next;
            //翻转一个子链表结束，把当前子链表拼接到上一个子链表末尾
            if (++i == k) {
                if (lastEnd != null) {
                    lastEnd.next = pre;
                }
                i = 0;
                lastEnd = currentHead;
                if (isFirstGroup) {
                    head = pre;
                    isFirstGroup = false;
                }
                currentHead = p;
                pre = null;
            }
            //下一次循环再次翻转最后一个子链表
            if (p == null && i < k) {
                k = i;
                i = 0;
                p = pre;
                pre = null;
            }
        }
        return head;
    }
}
