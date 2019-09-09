package com.stackroute;

public class CheckPalindrome {
    public static boolean isAPalindrome(int checkNum) {
        int s = 0, tempvar = checkNum, var, sum = 0;
        while (tempvar > 0) {
            var = tempvar % 10;
            if (var % 2 == 0) {
                sum += var;
            }
            tempvar = tempvar / 10;
            s = s * 10 + var;
        }
        if (s == checkNum) {
            return true;

        }
        else{
            return false;
        }

    }
}
