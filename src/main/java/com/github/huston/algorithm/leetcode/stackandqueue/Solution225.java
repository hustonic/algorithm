package com.github.huston.algorithm.leetcode.stackandqueue;

import java.util.LinkedList;

/**
 * 225. 用队列实现栈: https://leetcode-cn.com/problems/implement-stack-using-queues
 *
 * @author huxiantao
 * @date 2021-09-05
 */
public class Solution225 {

    /**
     * 用一个队列实现栈
     * 时间复杂度: 入栈O(n), 其余O(1)
     * 空间复杂度: O(n)
     */
    static class MyStack1 {
        LinkedList<Integer> queue;
        int len = 0;

        public MyStack1() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.offer(x);
            for (int i = 0; i < len; i++) {
                queue.offer(queue.poll());
            }
            len++;
        }

        public int pop() {
            if (queue.isEmpty())
                throw new NullPointerException();
            len--;
            return queue.poll();
        }

        public int top() {
            if (queue.isEmpty())
                throw new NullPointerException();
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    /**
     * 用两个队列实现栈
     * 时间复杂度: 入栈O(n), 其余O(1)
     * 空间复杂度: O(n)
     */
    static class MyStack2 {
        LinkedList<Integer> inQueue;
        LinkedList<Integer> outQueue;

        public MyStack2() {
            inQueue = new LinkedList<>();
            outQueue = new LinkedList<>();
        }

        public void push(int x) {
            inQueue.offer(x);
            while (!outQueue.isEmpty()) {
                inQueue.offer(outQueue.poll());
            }
            LinkedList<Integer> temp = inQueue;
            inQueue = outQueue;
            outQueue = temp;
        }

        public int pop() {
            if (outQueue.isEmpty())
                throw new NullPointerException();
            return outQueue.poll();
        }

        public int top() {
            if (outQueue.isEmpty())
                throw new NullPointerException();
            return outQueue.peek();
        }

        public boolean empty() {
            return inQueue.isEmpty() && outQueue.isEmpty();
        }
    }
}
