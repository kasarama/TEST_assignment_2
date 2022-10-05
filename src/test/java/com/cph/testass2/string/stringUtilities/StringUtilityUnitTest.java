package com.cph.testass2.string.stringUtilities;

import com.cph.testass2.StringUtility;
import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilityUnitTest extends TestCase {
    private StringUtility su;

    protected void setUp() {
        su = new StringUtility();
    }

    public void testSwapAllLowerCase() {
        assertTrue(su.swap("abc").equals("ABC"));
    }

    public void testSwapAllUpperCase() {
        assertTrue(su.swap("ABC").equals("abc"));
    }

    public void testSwapMixedCase() {
        assertTrue(su.swap("AbCd").equals("aBcD"));
    }

    public void testSwapInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            su.swap("ab1");
        }, "Invalid input");
    }

    public void testReverse() {
        assertEquals(su.reverse("abc"), "cba");
    }

    public void testCapitalize() {
        assertEquals(su.capitalize("aBcd"), "ABCD");
    }

    public void testCapitalizeInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            su.capitalize("ab1");
        }, "Invalid input");
    }


    public void testLowercase() {
        assertEquals(su.lowercase("aBcD"), "abcd");
    }

    public void testLowercaseInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            su.lowercase("AB1");
        }, "Invalid input");
    }


}