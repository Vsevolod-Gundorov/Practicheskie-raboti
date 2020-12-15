package com.company;

public class INN
{
    public static int getMyINN(int num) throws INNException
    {
        if (720414836 != num)
        {
            throw new INNException("Sorry it is not your INN, please write right INN", num);
        }
            else
            {
            return num;
            }
    }
}
