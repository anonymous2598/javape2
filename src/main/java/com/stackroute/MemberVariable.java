package com.stackroute;

public class MemberVariable {
    public static String[] checkmMethod ()
    {
        Member m= new Member();
        m.age=30;
        m.name="Harry Potter";
        m.salary=2500.3;
        String s[]={m.name,Integer.toString(m.age),String.valueOf(m.salary)};
        return s;
    }

}
class Member
{
    String name;
    int age;
    double salary;
}
