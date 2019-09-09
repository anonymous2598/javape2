package com.stackroute;

import java.math.BigInteger;

public class Factorial {
    public boolean FactIntMax(int num)
    {
        long checkNum=1;
        for(int i=1;i<=num;i++)
        {
            checkNum=checkNum*i;
        }
        if(checkNum<Integer.MAX_VALUE){
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean FactLongMax(int num)
    {
        BigInteger checkNum=new BigInteger("1");
        for(int i=1;i<=num;i++)
        {
            checkNum=checkNum.multiply(BigInteger.valueOf(i));
        }
        if(checkNum.compareTo(BigInteger.valueOf(Long.MAX_VALUE))==-1){
            return true;
        }
        else
        {
            return false;
        }

    }
}
