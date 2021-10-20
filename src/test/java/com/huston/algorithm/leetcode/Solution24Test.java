package com.huston.algorithm.leetcode;

import com.huston.algorithm.common.ListNode;
import com.huston.algorithm.leetcode.list.Solution24;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huxiantao
 * @date 2021-08-31
 */
class Solution24Test {

    Solution24 solution24 = new Solution24();

    @Test
    void swapPairs0() {
        ListNode swapPairs = solution24.swapPairs(ListNode.of());
        assertThat(swapPairs).isNull();
    }

    @Test
    void swapPairs1() {
        ListNode swapPairs = solution24.swapPairs(ListNode.of(1));
        assertThat(swapPairs.isEqualsTo(ListNode.of(1))).isTrue();
    }

    @Test
    void swapPairs2() {
        ListNode swapPairs = solution24.swapPairs(ListNode.of(1, 2));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1))).isTrue();
    }

    @Test
    void swapPairs3() {
        ListNode swapPairs = solution24.swapPairs(ListNode.of(1, 2, 3));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1, 3))).isTrue();
    }

    @Test
    void swapPairs4() {
        ListNode swapPairs = solution24.swapPairs(ListNode.of(1, 2, 3, 4));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1, 4, 3))).isTrue();
    }

    @Test
    void swapPairs5() {
        ListNode swapPairs = solution24.swapPairs(ListNode.of(1, 2, 3, 4, 5));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1, 4, 3, 5))).isTrue();
    }

    @Test
    void swapPairsRecursive0() {
        ListNode swapPairs = solution24.swapPairsRecursive(ListNode.of());
        assertThat(swapPairs).isNull();
    }

    @Test
    void swapPairsRecursive1() {
        ListNode swapPairs = solution24.swapPairsRecursive(ListNode.of(1));
        assertThat(swapPairs.isEqualsTo(ListNode.of(1))).isTrue();
    }

    @Test
    void swapPairsRecursive2() {
        ListNode swapPairs = solution24.swapPairsRecursive(ListNode.of(1, 2));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1))).isTrue();
    }

    @Test
    void swapPairsRecursive3() {
        ListNode swapPairs = solution24.swapPairsRecursive(ListNode.of(1, 2, 3));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1, 3))).isTrue();
    }

    @Test
    void swapPairsRecursive4() {
        ListNode swapPairs = solution24.swapPairsRecursive(ListNode.of(1, 2, 3, 4));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1, 4, 3))).isTrue();
    }

    @Test
    void swapPairsRecursive5() {
        ListNode swapPairs = solution24.swapPairsRecursive(ListNode.of(1, 2, 3, 4, 5));
        assertThat(swapPairs.isEqualsTo(ListNode.of(2, 1, 4, 3, 5))).isTrue();
    }
}