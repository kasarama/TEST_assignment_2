package com.cph.testass2.string.stringService;

import com.cph.testass2.StringService;
import com.cph.testass2.StringUtility;
import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StringServiceUnitTest extends TestCase {
    @Mock
    private StringUtility su;
    @InjectMocks
    private StringService ss;

    private String validInput = "aBcD";
    private String output = "xyz";
    private String[] validMethods = {"swap", "reverse", "capitalize", "lowercase"};


    protected void setUp() {
        MockitoAnnotations.initMocks(this);
        when(su.swap(validInput)).thenReturn(output);
        when(su.reverse(validInput)).thenReturn(output);
        when(su.capitalize(validInput)).thenReturn(output);
        when(su.lowercase(validInput)).thenReturn(output);
    }

    public void testGivenInvalidMethodThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ss.edit(validInput, "invalidMethod");
        }, "Invalid Method");
    }

    public void testGivenValidInputAndValidMethodReturnsOutput() {
        for (String method : validMethods
        ) {
            assertEquals(output, ss.edit(validInput, method));
        }
    }

}
