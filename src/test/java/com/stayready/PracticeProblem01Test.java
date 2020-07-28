package com.stayready;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeProblem01Test
{
    @Test
    public void palindromePartition()
    {
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("r a c e c a r");
        expectedList.add("r aceca r");
        expectedList.add("r a cec a r");

        Assert.assertEquals(expectedList, new PracticeProblem01().palindromePartition("racecar"));
    }

    @Test
    public void checkIfPalindrome()
    {
        boolean expected = true;
        String car = "racecar";

        Assert.assertEquals(expected, new PracticeProblem01().isPalindrome(car));
    }
}
