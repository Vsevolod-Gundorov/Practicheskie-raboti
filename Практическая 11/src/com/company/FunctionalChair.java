package com.company;

public class FunctionalChair implements Chair
{
    public int sum(int a, int b)
    {
        System.out.println(a+b);
        return 0;
    }
    @Override
    public void created()
    {
        System.out.println("FunctionalChair");
    }
}
