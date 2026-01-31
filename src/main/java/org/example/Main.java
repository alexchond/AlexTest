package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Main {

    private static final Map<Character, Character> BRACKETS = Map.of(
        '(', ')',
        '[', ']',
        '{', '}'
    );

    public static boolean balanced(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char bracket : input.toCharArray()) {
            if (BRACKETS.containsKey(bracket)) {
                deque.push(bracket);
            } else if (BRACKETS.containsValue(bracket)) {
                if (deque.isEmpty()) return false;
                if (BRACKETS.get(deque.pop()) != bracket) return false;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("() -> " + balanced("()"));
        System.out.println("[(]) -> " + balanced("[(])"));
        System.out.println("{()} -> " + balanced("{()}"));
    }
}