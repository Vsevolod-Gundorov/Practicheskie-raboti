package com.company;

public class ConcreteFactory implements ComplexAbstractFactory
{

    @Override
    public Complex createComplex()
    {
        return new ComplexDigit();
    }

    @Override
    public Complex CreateComplex(int real, int image)
    {
        return new createComplex(2,3);
    }
}
