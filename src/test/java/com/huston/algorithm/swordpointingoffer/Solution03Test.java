package com.huston.algorithm.swordpointingoffer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huxiantao
 * @since 2021-02-24 00:34
 */
class Solution03Test {

    Solution03 solution03 = new Solution03();

    @Test
    void findRepeatNumber1() {
        int[] input = new int[]{2, 3, 1, 0, 2, 5, 3};
        int output = solution03.findRepeatNumber1(input);
        assertThat(output).isEqualTo(2);

        input = new int[]{1, 1};
        output = solution03.findRepeatNumber1(input);
        assertThat(output).isEqualTo(1);
    }

    @Test
    void findRepeatNumber1NotRepeat() {
        int[] input = new int[]{2, 4, 1, 0, 6, 5, 3};
        int output = solution03.findRepeatNumber1(input);
        assertThat(output).isEqualTo(-1);

        input = new int[]{0};
        output = solution03.findRepeatNumber1(input);
        assertThat(output).isEqualTo(-1);
    }

    @Test
    void findRepeatNumber1InputError() {
        int output = solution03.findRepeatNumber1(null);
        assertThat(output).isEqualTo(-1);

        output = solution03.findRepeatNumber1(new int[0]);
        assertThat(output).isEqualTo(-1);
    }

    @Test
    void findRepeatNumber2() {
        int[] input = new int[]{2, 3, 1, 0, 2, 5, 3};
        int output = solution03.findRepeatNumber2(input);
        assertThat(output).isEqualTo(2);

        input = new int[]{1, 1};
        output = solution03.findRepeatNumber2(input);
        assertThat(output).isEqualTo(1);
    }

    @Test
    void findRepeatNumber2NotRepeat() {
        int[] input = new int[]{2, 4, 1, 0, 6, 5, 3};
        int output = solution03.findRepeatNumber2(input);
        assertThat(output).isEqualTo(-1);

        input = new int[]{0};
        output = solution03.findRepeatNumber2(input);
        assertThat(output).isEqualTo(-1);
    }

    @Test
    void findRepeatNumber2InputError() {
        int output = solution03.findRepeatNumber2(null);
        assertThat(output).isEqualTo(-1);

        output = solution03.findRepeatNumber2(new int[0]);
        assertThat(output).isEqualTo(-1);
    }

    @Test
    void findRepeatNumber3() {
        int[] input = new int[]{2, 3, 5, 4, 3, 2, 6, 7};
        int output = solution03.findRepeatNumber3(input);
        assertThat(output).isEqualTo(3);

        input = new int[]{1, 2, 2, 3};
        output = solution03.findRepeatNumber3(input);
        assertThat(output).isEqualTo(2);

        input = new int[]{1, 2, 1};
        output = solution03.findRepeatNumber3(input);
        assertThat(output).isEqualTo(1);

        input = new int[]{2, 1, 2};
        output = solution03.findRepeatNumber3(input);
        assertThat(output).isEqualTo(2);

        input = new int[]{1, 1};
        output = solution03.findRepeatNumber3(input);
        assertThat(output).isEqualTo(1);
    }

    @Test
    void findRepeatNumber3InputError() {
        int output = solution03.findRepeatNumber3(null);
        assertThat(output).isEqualTo(-1);

        output = solution03.findRepeatNumber3(new int[0]);
        assertThat(output).isEqualTo(-1);
    }
}