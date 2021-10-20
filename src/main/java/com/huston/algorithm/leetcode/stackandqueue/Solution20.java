package com.huston.algorithm.leetcode.stackandqueue;

import java.util.HashMap;
import java.util.Map;

/**
 * 20. 有效的括号: https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author huxiantao
 * @date 2021-09-04
 */
public class Solution20 {

    /**
     * 耗时更短、空间占用更少
     */
    public boolean isValid1(String s) {
        char[] stack = new char[s.length()];
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack[top++] = c;
                    break;
                case ')':
                    if (top == 0) return false;
                    c = stack[--top];
                    if (c != '(') return false;
                    break;
                case ']':
                    if (top == 0) return false;
                    c = stack[--top];
                    if (c != '[') return false;
                    break;
                case '}':
                    if (top == 0) return false;
                    c = stack[--top];
                    if (c != '{') return false;
                    break;
            }
        }
        return top == 0;
    }

    public boolean isValid2(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] stack = new char[s.length()];
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (top == 0) return false;
                if (stack[--top] != map.get(c)) return false;
            } else {
                stack[top++] = c;
            }
        }
        return top == 0;
    }
}
