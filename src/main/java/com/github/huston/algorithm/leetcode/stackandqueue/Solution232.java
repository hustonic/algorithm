package com.github.huston.algorithm.leetcode.stackandqueue;

import java.util.LinkedList;

/**
 * 232. 用栈实现队列: https://leetcode-cn.com/problems/implement-queue-using-stacks
 *
 * @author huxiantao
 * @date 2021-09-05
 */
public class Solution232 {

    /**
     * 用两个栈实现队列
     * 时间复杂度：入队 - O(1), 出队 - 摊还复杂度 O(1), 取队首元素 - O(1), 判断空 - O(1)
     * 空间复杂度 - O(n)
     * <p>
     * 摊还分析给出了所有操作的平均性能。摊还分析的核心在于，最坏情况下的操作一旦发生了一次，那么在未来很长一段时间都不会再次发生，这样就会均摊每次操作的代价。
     * </p>
     */
    static class MyQueue {

        LinkedList<Integer> inStack;
        LinkedList<Integer> outStack;
        int front = 0;

        public MyQueue() {
            inStack = new LinkedList<>();
            outStack = new LinkedList<>();
        }

        public void push(int x) {
            if (inStack.isEmpty())
                front = x;
            inStack.push(x);
        }

        public int pop() {
            if (outStack.isEmpty())
                while (!inStack.isEmpty())
                    outStack.push(inStack.pop());
            return outStack.pop();
        }

        public int peek() {
            if (empty())
                throw new NullPointerException();
            if (outStack.isEmpty())
                return front;
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }
}
