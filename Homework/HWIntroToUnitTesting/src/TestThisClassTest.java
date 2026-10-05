import org.junit.Test;

import static org.junit.Assert.*;

public class TestThisClassTest {

    @Test
    public void numberOfXs() {
        // Case 1: Empty String
        // Why Different: Tests lower boundary condition.
        assertEquals(0, TestThisClass.numberOfXs(""));
        // Case 2: Only Valid X's Used
        // Why Different:It tests the expected path only X no differing elements.
        assertEquals(7, TestThisClass.numberOfXs("xXxxxXx"));
        // Case 3: Completely Unrelated String
        // Why Different: It tests a string full of letters that shouldn't be counted.
        assertEquals(0, TestThisClass.numberOfXs("abc def"));
        // Case 4 (Error): Failing Condition
        // Why it Fails and what's different: This case tests characters close to x like y and z which fails because
        // the code seems to be using ASCII or a number related identifying system dividing by
        // to find x however because it has to round to a number or else it won't work
        // it is flawed as it can be either x,y, or z.
        assertEquals(3, TestThisClass.numberOfXs("yYXab xpXz"));
    }

    @Test
    public void countChocula() {
        // Case 1: Completely Unrelated String
        // Why Different: It verifies that an unrelated string doesn't have any false positives.
        assertEquals(0, TestThisClass.countChocula("310-seagull-powered-windmill"));
        // Case 2: Empty String
        // Why Different: Tests lower boundary condition.
        assertEquals(0, TestThisClass.countChocula(""));
        // Case 3 (Error): Failing Condition
        // Why it Fails and what's different: This is a string with unrelated letters and the targeted word at the end.
        // However, because the loop uses i < input.length() - 7 instead of using <=
        // the method stops before the final 7 letters of the string causing failure
        assertEquals(1, TestThisClass.countChocula("Here Comes Chocula"));
        // Case 4 (Error): Failing Condition 2
        // Why it Fails and what's different: This is an exact match of what should be counted as correct.
        // Though much like case 3 because of the i < input.length - 7 statement not being < =
        // This string is false. Though particularly because the length of the string is 7
        // so 7-7 = 0 automatically making the comparison false.
        assertEquals(1, TestThisClass.countChocula("Chocula"));
    }

    @Test
    public void countAlternations() {
        // Case 1: Positive Alternating
        // Why Different: It tests the expected result of this code with not much
        // interfering values starting at a positive value
        assertEquals(3, TestThisClass.countAlternations(new int[]{1, -3, 74, 35, -64}));
        // Case 2: Empty Integer Array
        // Why Different: Tests lower boundary condition
        assertEquals(0, TestThisClass.countAlternations(new int[]{}));
        // Case 3: Negative Alternating
        // Why Different: It tests the expected result of this code but instead starts with a negative number
        assertEquals(3, TestThisClass.countAlternations(new int[]{-10, 20, -30, 40}));
        // Case 4: Only Positive No Alternating
        // Why Different: This tests a pathway expected to be one of failure.
        assertEquals(0, TestThisClass.countAlternations(new int[]{10, 20, 30, 40}));
    }
}