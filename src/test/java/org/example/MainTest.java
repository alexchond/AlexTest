package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testBalancedStrings() {
        assertTrue(Main.balanced("()"));
        assertTrue(Main.balanced("{{[[()]]}}"));
        assertTrue(Main.balanced(""));
    }

    @Test
    void testUnbalancedStrings() {
        assertFalse(Main.balanced("[(])"));
        assertFalse(Main.balanced("(]"));
        assertFalse(Main.balanced("("));
        assertFalse(Main.balanced(")"));
    }
}
