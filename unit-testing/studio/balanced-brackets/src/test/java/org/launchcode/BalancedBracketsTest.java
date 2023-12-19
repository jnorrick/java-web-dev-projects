package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringEmptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void stringWrappedInSingleBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringWithBracketInFrontReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void secondHalfOfStringWrappedInBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void missingSecondBracketAroundStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void missingSecondBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringContainingInverseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void inverseBracketOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multiplePairsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This] [is] [a] [test]"));
    }
    @Test
    public void nestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[ test]"));
    }

    @Test
    public void multipleNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[ test]]"));
    }

    @Test
    public void multiplePairsOfNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[this] ] [is] [[ a] ][string]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}