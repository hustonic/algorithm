package com.huston.algorithm.leetcode;

import com.huston.algorithm.leetcode.stackandqueue.Solution20;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huxiantao
 * @date 2021-09-04
 */
class Solution20Test {
    Solution20 solution20 = new Solution20();

    @Test
    void isValid1() {
        assertThat(solution20.isValid1("(")).isFalse();
        assertThat(solution20.isValid1("}")).isFalse();
        assertThat(solution20.isValid1("()")).isTrue();
        assertThat(solution20.isValid1(")(")).isFalse();
        assertThat(solution20.isValid1("(()")).isFalse();
        assertThat(solution20.isValid1(")()")).isFalse();
        assertThat(solution20.isValid1("({)}")).isFalse();
        assertThat(solution20.isValid1("({})")).isTrue();
        assertThat(solution20.isValid1("[]()")).isTrue();
    }

    @Test
    void isValid2() {
        assertThat(solution20.isValid2("(")).isFalse();
        assertThat(solution20.isValid2("}")).isFalse();
        assertThat(solution20.isValid2("()")).isTrue();
        assertThat(solution20.isValid2(")(")).isFalse();
        assertThat(solution20.isValid2("(()")).isFalse();
        assertThat(solution20.isValid2(")()")).isFalse();
        assertThat(solution20.isValid2("({)}")).isFalse();
        assertThat(solution20.isValid2("({})")).isTrue();
        assertThat(solution20.isValid2("[]()")).isTrue();
    }
}