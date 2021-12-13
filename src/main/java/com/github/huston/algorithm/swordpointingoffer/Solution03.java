package com.github.huston.algorithm.swordpointingoffer;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * <p>
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * <p>
 * 限制：
 * 2 <= n <= 100000
 *
 * @author huxiantao
 * @since 2021-02-23 01:12
 */
public class Solution03 {

    /**
     * Hash表法，时间O(n)，空间O(n)
     *
     * @param nums 可能包含重复数字的数组
     * @return 重复的数字，不存在时返回-1。
     */
    public int findRepeatNumber1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        boolean[] hasNum = new boolean[nums.length];
        for (int num : nums) {
            if (hasNum[num]) {
                return num;
            } else {
                hasNum[num] = true;
            }
        }
        return -1;
    }

    /**
     * 原地置换法，时间O(n)，空间O(1)
     */
    public int findRepeatNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    /**
     * 长度为n+1的数组里，所有数字都在1~n的范围内，所以数组至少有一个数字重复。
     * 要求不修改原数组，找出任意一个重复的数字
     * <p>
     * 二分法，时间O(nlogn)，空间O(1)，时间换空间
     * <p>
     * 例：
     * 输入：{2,3,5,4,3,2,6,7}。输出：2或3
     */
    public int findRepeatNumber3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int min = 1;
        int max = nums.length - 1;
        int mid = (min + max) / 2;
        int count;
        while (min < max) {
            count = 0;
            for (int num : nums) {
                if (min <= num && num <= mid) {
                    count++;
                }
            }
            if (count > mid - min + 1) {
                max = mid;
            } else {
                min = mid + 1;
            }
            mid = (min + max) / 2;
        }
        return mid;
    }
}
