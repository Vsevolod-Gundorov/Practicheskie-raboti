package com.company;

public class MagicChair implements Chair
{
    public void doMagic()
    {
        System.out.println("Abracadabra, say your wish");
    }
    @Override
    public void created()
    {
        System.out.println("MagicChair");
    }
}
