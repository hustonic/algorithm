package com.huston.algorithm.leetcode;

import com.huston.algorithm.common.ListNode;
import com.huston.algorithm.leetcode.list.Solution25;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huxiantao
 * @date 2021-09-03
 */
class Solution25Test {
    Solution25 solution25 = new Solution25();

    @Test
    void testReverseKGroup1() {
        reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 1, ListNode.of(1, 2, 3, 4, 5));
        reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 2, ListNode.of(2, 1, 4, 3, 5));
        reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 3, ListNode.of(3, 2, 1, 4, 5));
        reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 4, ListNode.of(4, 3, 2, 1, 5));
        reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 5, ListNode.of(5, 4, 3, 2, 1));
    }

    @Test
    void testReverseKGroup2() {
        reverseKGroup(ListNode.of(), 0, ListNode.of());
        reverseKGroup(ListNode.of(1), 1, ListNode.of(1));
        reverseKGroup(ListNode.of(1, 2), 1, ListNode.of(1, 2));
        reverseKGroup(ListNode.of(1, 2), 2, ListNode.of(2, 1));
        reverseKGroup(ListNode.of(1, 2, 3), 1, ListNode.of(1, 2, 3));
        reverseKGroup(ListNode.of(1, 2, 3), 2, ListNode.of(2, 1, 3));
        reverseKGroup(ListNode.of(1, 2, 3), 3, ListNode.of(3, 2, 1));
    }

    private void reverseKGroup(ListNode head, int k, ListNode expected) {
        ListNode result = solution25.reverseKGroup(head, k);
        assertThat(ListNode.equals(result, expected)).isTrue();
    }
}