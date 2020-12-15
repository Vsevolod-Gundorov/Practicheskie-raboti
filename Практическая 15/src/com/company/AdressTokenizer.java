package com.company;

import java.util.StringTokenizer;

public class AdressTokenizer
{
    public String adress = "Россия,86,Нижневартовск,Механиков,11,3,2";
    public String adress1 = "Россия,77,Москва,Ленина,17,1,5";
    public String adress2 = "Россия,77,Москва,Маяковская,12,2,7";
    public String adress3 = "Россия,66,Екатеринбург,Северная,23,11,3";
    void splitAndShowAdressToken()
    {
        StringTokenizer tokenizer = new StringTokenizer(adress,",");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
        System.out.println();
        StringTokenizer tokenizer1 = new StringTokenizer(adress1,",");
        while (tokenizer1.hasMoreTokens())
        {
            String token1 = tokenizer1.nextToken();
            System.out.println(token1);
        }
        System.out.println();
        StringTokenizer tokenizer2 = new StringTokenizer(adress2,",");
        while (tokenizer2.hasMoreTokens())
        {
            String token2 = tokenizer2.nextToken();
            System.out.println(token2);
        }
        System.out.println();
        StringTokenizer tokenizer3 = new StringTokenizer(adress3,",");
        while (tokenizer3.hasMoreTokens())
        {
            String token3 = tokenizer3.nextToken();
            System.out.println(token3);
        }
    }
}
