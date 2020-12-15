package com.company;

public class VictorianChair implements Chair
{
    private int age;
    public int getAge()
    {
        age = 21 - 6;
        return age;
    }
    public VictorianChair(int age)
    {
        System.out.println("Victorian chair from " + getAge() + " age");
    }

    @Override
    public void created()
    {
        System.out.println("VictorianChair");
    }
}
