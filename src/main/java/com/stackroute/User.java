package com.stackroute;

public class User {
    private String firstName="a";
    private String lastName="b";
    private int age;
    private double salary;
    public boolean isValidAge(int age)
    {
        if(age<60 && age> 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void setAge(int a)
    {
        if(age>0 && age<100)
        {
            this.age=a;
        }
        else
        {
            System.out.println("Enter valid age");
        }
    }
    public String getFullName()
    {

        return (this.firstName+" "+this.lastName);
    }
}
