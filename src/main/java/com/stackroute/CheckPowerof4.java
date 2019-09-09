package com.stackroute;

public class CheckPowerof4 {
    public static boolean isPowerof4(int checkNum) {
        int s = 1,flag=1;
        while (s <= checkNum && flag==1) {
            if(checkNum==s)
            {
                flag=0;
            }
            else
            {
                s=s*4;
            }

        }
        if (flag  == 0) {
            return true;

        }
        else{
            return false;
        }

    }
}
