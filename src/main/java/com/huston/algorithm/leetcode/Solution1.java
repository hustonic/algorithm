package com.huston.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 01.两数之和: https://leetcode-cn.com/problems/two-sum/
 *
 * @author huxiantao
 * @date 2021-08-27
 */
public class Solution1 {
    /**
     * Hash表法：时间O(n), 空间O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        Integer j;
        for (int i = 0; i < nums.length; i++) {
            if ((j = map.get(target - nums[i])) != null) {
                return new int[]{j, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
