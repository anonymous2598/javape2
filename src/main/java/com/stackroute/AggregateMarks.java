package com.stackroute;

public class AggregateMarks {
    public double avg (int arr[])
    {
        double average=0.0,sum=0.0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        average=sum/arr.length;
        return average;
    }

    public int max(int arr[])
    {
        int maximum=-1;
        for (int i = 0; i < arr.length; i++) {

            if(maximum<arr[i])
            {
                maximum=arr[i];
            }
        }

        return maximum;
    }
    public int min(int arr[])
    {
        int minimum=101;
        for (int i = 0; i < arr.length; i++) {

            if(minimum>arr[i])
            {
                minimum=arr[i];
            }
        }

        return minimum;
    }
}
