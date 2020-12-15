package com.company;

public class INNException extends Exception
{
    private int INN;
    public int getINN(){return INN;}
    public INNException(String message, int num){
        super(message);
        INN = num;
    }
}
