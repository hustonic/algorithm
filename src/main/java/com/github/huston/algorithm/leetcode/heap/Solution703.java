package com.github.huston.algorithm.leetcode.heap;

import java.util.PriorityQueue;

/**
 * 703. 数据流中的第 K 大元素: https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 *
 * @author huxiantao
 * @date 2021-09-07
 */
public class Solution703 {

    /**
     * 通过PriorityQueue实现堆
     * 时间复杂度：
     * 初始化时间复杂度为：O(nlogk) ，其中 n 为初始化时 nums 的长度；
     * 单次插入时间复杂度为：O(logk)。
     * 空间复杂度：O(k)。需要使用优先队列存储前 k 大的元素。
     */
    static class KthLargest1 {
        private final PriorityQueue<Integer> minHeap;
        private final int k;

        public KthLargest1(int k, int[] nums) {
            minHeap = new PriorityQueue<>(k);
            this.k = k;
            for (int num : nums)
                add(num);
        }

        public int add(int val) {
            if (minHeap.size() < k) {
                minHeap.offer(val);
            } else if (val >= minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(val);
            }
            return minHeap.peek();
        }
    }

    /**
     * 手工实现二叉堆
     */
    static class KthLargest2 {
        private final int[] minHeap;
        private final int k;
        private int size = 0;

        public KthLargest2(int k, int[] nums) {
            minHeap = new int[k];
            this.k = k;
            for (int num : nums)
                add(num);
        }

        public int add(int val) {
            if (size < k) {
                offer(minHeap, val);
            } else if (val >= peek(minHeap)) {
                poll(minHeap);
                offer(minHeap, val);
            }
            return peek(minHeap);
        }

        private void offer(int[] minHeap, int val) {
            int i = size++;
            minHeap[i] = val;
            while (i != 0) {
                int j = (i - 1) / 2;
                if (minHeap[i] >= minHeap[j])
                    break;
                int temp = minHeap[i];
                minHeap[i] = minHeap[j];
                minHeap[j] = temp;
                i = j;
            }
        }

        private int poll(int[] minHeap) {
            int top = minHeap[0];
            minHeap[0] = minHeap[--size];
            int i = 0;
            int child = 1;
            while (child < size) {
                if (child + 1 < size && minHeap[child + 1] < minHeap[child])
                    child++;
                if (minHeap[i] < minHeap[child])
                    break;
                int temp = minHeap[i];
                minHeap[i] = minHeap[child];
                minHeap[child] = temp;
                i = child;
                child = 2 * i + 1;
            }
            return top;
        }

        private int peek(int[] minHeap) {
            return minHeap[0];
        }
    }
}
