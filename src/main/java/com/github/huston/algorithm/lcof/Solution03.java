package com.github.huston.algorithm.lcof;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 *
 * @author huxiantao
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
            }
            hasNum[num] = true;
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
