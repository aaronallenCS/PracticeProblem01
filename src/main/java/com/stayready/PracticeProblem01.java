package com.stayready;

import java.util.ArrayList;
import java.util.List;

public class PracticeProblem01
{
    public static List<String> palindromePartition(String s)
    {
        List<String> arrList = new ArrayList<>();
        if(isPalindrome(s))
        {
            int low = 0;
            int high = s.length() - 1;
            arrList.add(s.substring(low, high + 1).replaceAll("", " "));
            while(low <= s.length() && high >= low && s.charAt(low) == s.charAt(high))
            {
                arrList.add(s.substring(low, high + 1).replaceAll("", ""));
                low++;
                high--;
            }
        }
        return arrList;
    }

    public static boolean isPalindrome(String s)
    {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
