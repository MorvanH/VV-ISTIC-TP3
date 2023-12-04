package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void testIsBalancedWithBalancedSymbols() {
        assertTrue(StringUtils.isBalanced("{[()]}"));
    }

    @Test
    public void testIsBalancedWithUnbalancedSymbols() {
        assertFalse(StringUtils.isBalanced("{(}{})"));
    }

    @Test
    public void testIsBalancedWithClosingSymbolFirst() {
        assertFalse(StringUtils.isBalanced("}(){"));
    }
    @Test
    public void testIsBalancedWithOnlyOpening() {
        assertFalse(StringUtils.isBalanced("{[("));
    }

    @Test
    public void testIsBalancedWithEmptyString() {
        assertTrue(StringUtils.isBalanced(""));
    }

}